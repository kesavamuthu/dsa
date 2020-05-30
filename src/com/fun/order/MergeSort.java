package com.fun.order;

public class MergeSort
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] a = {5, 6, 7, 8, 1, 2, 3, 4};
        for(int b : a)
            System.out.print(a +" ");
        merge(a, 0, a.length);

        for(int b : a)
            System.out.print(a +" ");
    }

    static	void merge(int[] a, int l, int r){
        int mid = l + r / 2;
        int tmp = 0;
        if(mid >= r/2)
            return;
        if(a[l] > a[mid]){
            tmp = a[l];
            a[l] = a[mid];
            a[mid] = tmp;
        }
        else{
            tmp = a[mid];
            a[mid] = a[l];
            a[l] = tmp;
        }
        merge(a, l + 1, r);
    }
}
