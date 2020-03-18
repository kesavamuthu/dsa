package com.fun.order;

public class LargeNumberIndexFinder
{

    public static void main(String[] args)
    {
        int[] a = {1};
        int largest = a[0];
        int secLarge = 0;
        int index = -1;
        for(int i = 1; i < a.length; ++i){
            if(a[i] > largest){
                secLarge = largest;
                largest = a[i];
                index = i;
            }
            else if(secLarge < a[i])
                secLarge = a[i];
        }
        System.out.println(largest >= secLarge * 2 ? index : -1);
    }

}
