package com.fun.failure;

public class KthPrimeFactorFinder
{
    static int kth_PrimeFactor(int N, int K)
    {
        // Your code here
        // Make your own sieve function which
        // You can also create your own custom util function
        // which will return Kth Prime Factor
        /*
        this is like brute force not able to provide the solution but the sample test
        cases are able to pass.
         Input:
        2
        225 2
        81 5

        Output:
        3
        -1

        Explanation:
        Testcase 1: The prime factors of 225 are 3 3 5 5, thus 2nd prime factor of 225 is 3
        Testcase 2: Prime factors of 8 are 3 3 3 3, thus 5th prime factor does not exists resulting -1
         */
        int num = 2;
        int count = 0;
        int[] prime = new int[N/4];

        int i = 0;
        //int
        while(i < prime.length && prime[i] == 0){
            if(isPrime(num))
                prime[i++] = num;
            ++num;
            //   System.out.println(num);
        }

        i = 0;

        while(N != 1)
        {
            if(N % prime[i] == 0){
                count++;
                N /= prime[i];
            }
            else
                i++;
            // System.out.println(N);
            if(count == K)
                return prime[i];
        }

        return -1;
    }

    static boolean isPrime(int num){
        if(num == 2)
            return true;
        for(int i = 2; i * 2 <= num; i += 2)
            if(num % i == 0)
                return false;
        return true;
    }
}
