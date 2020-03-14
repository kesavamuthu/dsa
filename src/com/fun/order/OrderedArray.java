package com.fun.order;

public class OrderedArray
{

    private int insertionIndex = 0;
    private int[] values;
    private int size = 100;

    public OrderedArray()
    {
        values = new int[size];
    }

    public OrderedArray(int size)
    {
        values = new int[size];
        this.size = size;
    }

    public void setArray(int a)
    {

    }
}
