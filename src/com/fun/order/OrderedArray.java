package com.fun.order;

public class OrderedArray
{

    private int insertionIndex = 0;
    private int[] values;
    private int size = 10;
    private int absentValue = 0;
    private boolean sorted = false;

    public OrderedArray()       //constructor
    {
        values = new int[size];
    }

    public OrderedArray(int size) //Overloaded constructor

    {
        values = new int[size];
        this.size = size;
    }

    public void setArrayValues(int a)
    {
        if(insertionIndex == size)
            growable();
        values[insertionIndex++] = a;
        sorted = false;
    }

    public void printArray()
    {
        for (int i = 0; i < insertionIndex; ++i)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    private int binarySearch(int a)
    {
        int firstIndex = 0;
        int lastIndex = insertionIndex;
        int mid = firstIndex + lastIndex / 2;

        if (!sorted)
        {
            sort();
        }
        while (mid < size)
        {
            if (values[mid] == a)
            {
                return mid;
            }
            else if (values[mid] < a)
            {
                mid = ++firstIndex + lastIndex / 2;
            }
            else if (values[mid] > a)
            {
                mid = firstIndex + --lastIndex / 2;
            }
        }
        return size;
    }

    public boolean delete(int a)
    {
        int index = binarySearch(a);
        if (index != size)
        {
            mover(index, insertionIndex);
            values[--insertionIndex] = absentValue;
            printArray();
            return true;
        }
        return false;
    }

    public boolean insert(int a)
    {
        if (!sorted)
        {
            sort();
        }
        if(insertionIndex + 1 == size)
            growable();
        for (int i = 0; i < insertionIndex; ++i)
        {
            if (values[i] >= a)
            {
                mover(++insertionIndex, i);
                values[i] = a;
                return true;
            }
        }
        return false;
    }

    private void mover(int first,
                       int second)
    {
        boolean reverse = first > second;

        for (int i = first; i != second; )
        {
            if (reverse)
            {
                values[i] = values[--i];
            }
            else
            {
                values[i] = values[++i];
            }
        }
    }

    private void sort()
    {
        int tmp = 0;
        System.out.println(insertionIndex);
        for (int i = 0; i < insertionIndex; ++i)
        {
            for (int j = i + 1; j < insertionIndex; ++j)
            {
                if (values[i] > values[j])
                {
                    tmp = values[j];
                    mover(j, i);
                    values[i] = tmp;
                }
            }
        }
    }

    private void growable(){
        this.size += 21;
        int[] tmp = new int[size];
        for(int i = 0; i < insertionIndex; ++i)
            tmp[i] = values[i];
      //  tmp[insertionIndex + 1]
        values = tmp;
    }
}
