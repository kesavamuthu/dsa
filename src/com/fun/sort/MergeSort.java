package com.fun.sort;

import java.util.*;

public class MergeSort
{

    public static void main(String[] args)
    {
        int[] arr = { 3,
                      4,
                      1,
                      2 };
        merge(arr, 0, 2, 4);
        System.out.println(Arrays.toString(arr));
    }

    static void merge(int[] arr,
                      int low,
                      int mid,
                      int high)
    {
        while (low < mid && mid < high)
        {
            if (arr[low] < arr[mid])
            {
                swap(arr, low++, mid);
            }
            else
            {
                swap(arr, low, mid++);
            }
        }
    }

    static void swap(int[] arr,
                     int i,
                     int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
