package com.fun.stack;

import java.util.Scanner;
import java.util.Stack;

public class HistogramTriangleFinder
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(largestAreaFinder(sc.nextInt(), sc));
    }

    static int largestAreaFinder(int size,
                                 Scanner sc)
    {
        int[] arr = new int[size];
        int largest = 0;
        int result = 0;
        int index;

        for (int i = 0; i < size; ++i)
        {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> pos = new Stack<>();

        for (int i = 0; i < size; ++i)
        {
            if (pos.isEmpty() || arr[pos.peek()] < arr[i])          // 6 2 5 4 5 3 6
            {
                pos.push(i);
                result = arr[i];
            }
            else
            {
                index = pos.pop();
                result = arr[index] * (pos.isEmpty() ? i : i - index);
                pos.push(i);
            }

            largest = Math.max(largest, result);
        }

        while (!pos.isEmpty())
        {
            index = pos.pop();
            result = arr[index] * (arr.length - index);
            largest = Math.max(largest, result);
        }

        return largest;
    }
}


