package com.fun.tree;

import java.util.Arrays;

class BinaryTree
{

    int MAX_SIZE = 20;
    int[] arr;
    int size = -1;

    // int root = 0;
    BinaryTree()
    {
        arr = new int[MAX_SIZE];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }

    int rightChild(int i)
    {
        return 2 * i + 2;
    }

    int leftChild(int i)
    {
        return 2 * i + 1;
    }

    int root(int i)
    {
        return (i - 1) / 2;
    }

    void add(int a)
    {
        if (size > arr.length)
        {
            System.out.println("I m full");
            return;
        }
        arr[++size] = a;
    }

    void preOrderTraversal(int root)
    {
        if (root > size)
        {
            return;
        }
        System.out.print(arr[root] + " ");
        preOrderTraversal(leftChild(root));
        preOrderTraversal(rightChild(root));

    }

    /*int[] getAll(){
        return arr;
    }*/

    void postOrderTraversal(int root)
    {
        if (root > size)
        {
            return;
        }
        postOrderTraversal(leftChild(root));
        postOrderTraversal(rightChild(root));
        System.out.print(arr[root] + " ");
    }


    void inOrderTraversal(int root)
    {
        if (root > size)
        {
            return;
        }
        inOrderTraversal(leftChild(root));
        System.out.print(arr[root] + " ");
        inOrderTraversal(rightChild(root));
    }

    void levelOrderTraversal()
    {
        int i = 1;
        int root = 0;

        while (i < MAX_SIZE)
        {
            while (root < i)
            {
                if (arr[root] == Integer.MIN_VALUE)
                {
                    return;
                }
                System.out.print(arr[root++] + " ");
            }
            i <<= 1;
        }
    }

    void levelOrderTraversalUsingRecursion(int root,
                                           int i)
    {
        if (arr[i] == Integer.MIN_VALUE)
        {
            return;
        }
        while (i <= size && i < root)
        {
            System.out.print(arr[i++] + " ");
        }
        if (i > size)
        {
            return;
        }
        levelOrderTraversalUsingRecursion(root << 1, i);
    }

   /* int heightOfTheTree(int root){

    }*/

    void printIt(int root){

    }
}

