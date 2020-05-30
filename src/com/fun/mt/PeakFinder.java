package com.fun.mt;

class PeakFinder
{

    /**
     * not working correctly optimized. Need to fix it.
     */
    int[] arr;

    PeakFinder(int a)
    {
        arr = new int[a];
    }

    PeakFinder(int[] in)
    {
        arr = in;
    }

    void input(int i,
               int a)
    {
        if (i < arr.length)
        {
            arr[i] = a;
        }
    }

    private boolean isPeak(int i)
    {
        if (i == 0)
        {
            return arr[i] >= arr[i + 1];
        }
        if (i == arr.length - 1)
        {
            return arr[i - 1] <= arr[i];
        }

        return arr[i - 1] <= arr[i] && arr[i] >= arr[i + 1];
    }

    int normalPeakFinder()
    {
        long t1 = System.nanoTime();
        int peak = -1;
        for (int i = 0; i < arr.length; ++i)
        {
            if (isPeak(i))
            {
                peak = arr[i];
                break;
            }
        }
        System.out.println("Total time for normal one " + (System.nanoTime() - t1));
        return peak;
    }

    int optimizedPeakFinder()
    {
        long t1 = System.nanoTime();
        int peak = -1;
        int i = 0;
        int r = arr.length - 1;
        int mid = 0;
        while (i <= r)
        {
            mid = i + (r - 1) / 2;
            //    System.out.println(mid + "   " + arr.length);
            if (isPeak(mid))
            {
                peak = arr[mid];
                break;
            }
            else if (arr[mid] < arr[mid - 1])
            {
                i = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }
        System.out.println("Total time for optimized one " + (System.nanoTime() - t1));
        return peak;
    }

    public static void main(String[] args)
    {
        int t = 10;
        for (int i = 0; i < 8; ++i)
        {
            int[] arr = new int[t];
            t *= 10;
            for (int j = 0; j < arr.length; ++j)
            {
                arr[j] = (int) Math.floor(Math.random() * t);
            }

            PeakFinder pf = new PeakFinder(arr);
            System.out.println("Input size : " + arr.length);
            System.out.println(pf.normalPeakFinder());
            System.out.println(pf.optimizedPeakFinder());

        }
    }
}
