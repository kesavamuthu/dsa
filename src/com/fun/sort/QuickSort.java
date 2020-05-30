package com.fun.sort;

import java.util.Arrays;

public class QuickSort
{
private int partition(int[] arr, int low, int high){
    int pivot = arr[high];
    int i = low - 1;

    for(int j = low; j < high; ++j)
        if(arr[j] <= pivot){
            swap(arr, ++i, j);
        }
    swap(arr, ++i, high);
    return i;
}

private void sort(int[] arr, int low, int high){
    if(low < high)
    {
        int piIndex = partition(arr, low, high);
        sort(arr, low, piIndex - 1);
        sort(arr, piIndex + 1, high);
    }
}

private void swap(int[] arr, int i, int j){
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
}

public void quickSort(int[] arr){
    sort(arr, 0, arr.length - 1);
}
    public static void main(String[] args)
    {
        QuickSort qs = new QuickSort();
        int[] arr = {5,4,3,2,1, 6};
        qs.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
