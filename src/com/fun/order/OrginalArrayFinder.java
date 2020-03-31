package com.fun.order;

import java.util.Scanner;

public class OrginalArrayFinder
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; ++i){
            for(int a : finder(sc.nextInt(), sc))
                System.out.print(a + " ");
            System.out.println();
        }
    }

    static int[] finder(int size, Scanner sc){
        int[] arr = new int[size];
        int k = 0;
        for(int i = 0; i < size; ++i)
            arr[i] = sc.nextInt();

        int outputArraySize = arraySizeFinder(size);
        int[] output = new int[outputArraySize];

        boolean flag = false;
        int i = 0;
        while(!flag){
                i++;
                if(arr[0] % i == 0){
                    output[0] = i;
                    for(int j = 0; j < outputArraySize - 1; ++j)
                        output[j + 1] = arr[j] / i;
                  //  System.out.println(i);
                    flag = compare(output, arr);
                }
        }
        // if(arr[0] > 1){
        //     if(sieveOfEratoshthenes(arr[0]) || ){
        //         output[0] = 1;
        //         for(int i = 0; i < outputArraySize; ++i)
        //         outpu[i + 1] = arr[i];
        //     }
        //     else{
        //         for(int i = 2; i < arr[0]; ++i)
        //         output[0] = arr[0];
        //         for(int i = 0; i < outputArraySize; ++i)
        //         outpu[i + 1] = arr[i] / output[0];

        //     }
        // }

        return output;
    }


    static int arraySizeFinder(int size){
        int n = size / 2;
        int out = 0;
        while(out != size){
            out = n * (n - 1) / 2;
            if(out > size)
                n--;
            else if(out < size)
                n++;
            // System.out.println(out);
        }
        return n;
    }

    static boolean sieveOfEratoshthenes(int a){
        boolean[] prime = new boolean[a + 1];

        for(int i = 2; i <= a; ++i){
            if(!prime[i])
            {
                for(int j = i * i; j <= a; j += i)
                    prime[j]  = true;
            }
            else
                continue;

        }

        return !prime[a];
    }


    static boolean compare(int[] first, int[] result){
        int k = 0;

        System.out.println();
        for(int i = 0; i < first.length - 1; ++i)
            for(int j = i + 1; j < first.length; ++j)
                if(first[i] * first[j] != result[k++])
                    return false;

        return true;
    }
}
