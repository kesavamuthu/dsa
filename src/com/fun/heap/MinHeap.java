package com.fun.heap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class MinHeap
{

    private int[] val;
    private int size;
    private int PERM_SIZE = 150;

    MinHeap()
    {
        val = new int[PERM_SIZE];
        size = -1;
        for(int i = 0; i < PERM_SIZE; ++i)
            val[i] = 101;
    }

    public void insert(int value)
    {
        int tmpPos;

        if (size > PERM_SIZE - 1)
        {
            return;
        }

        val[++size] = value;
        int current;
        current = size;
        while (parent(current) >= 0 &&
               val[parent(current)] > val[current])
        {
            swap(parent(current), current);
            current = parent(current);
        }
    }

    public void remove(int in)
    {
        if (size <= in)
        {
            //   size++;
            //  System.out.print("in ");
            swap(in, size--);
            minHeapify(in);
        }
    }

    public int pop()
    {

        if (size < 0)
        {
            //System.out.print("in " + size);
            return -1;
        }

        int element = val[0];
        swap(0, size--);
        minHeapify(0);
        return element;
    }

    private void minHeapify(int pos)
    {

        if (isLeafNode(pos))
        {
            return;
        }

        if (val[pos] > val[leftChild(pos)] ||
            val[pos] > val[rightChild(pos)])
        {
            if (val[pos] > val[leftChild(pos)])
            {
                swap(pos, leftChild(pos));
                minHeapify(leftChild(pos));
            }
            else
            {
                swap(pos, rightChild(pos));
                minHeapify(rightChild(pos));
                //pos = rightChild(pos);
            }
        }
    }

    private boolean isLeafNode(int pos)
    {
        return (pos >= (size / 2) && pos <= size);
    }

    private int leftChild(int pos)
    {
        return (2 * pos) + 1;
    }

    private int rightChild(int pos)
    {
        return (2 * pos) + 2;
    }

    private int parent(int pos)
    {
        return (pos - 1) / 2;
    }

    private void swap(int pos1,
                      int pos2)
    {
        val[pos1] = val[pos1] ^ val[pos2];
        val[pos2] = val[pos1] ^ val[pos2];
        val[pos1] = val[pos1] ^ val[pos2];
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;

        for (int i = 0; i < t; ++i)
        {
            MinHeap mh = new MinHeap();
            int size = sc.nextInt();
            for (int j = 0; j < size; ++j)
            {
                a = sc.nextInt();
                switch (a)
                {
                    case 1:
                        mh.insert(sc.nextInt());
                        break;
                    case 2:
                        mh.remove(sc.nextInt());
                        break;
                    case 3:
                        System.out.print(mh.pop() + " ");
                }
            }
        }
    }
}