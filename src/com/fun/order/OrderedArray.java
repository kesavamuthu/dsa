package com.fun.order;

public class OrderedArray
{

    private int insertionIndex = 0;
    private int[] values;
    private int size = 100;

    public OrderedArray()       //constructor
    {
        values = new int[size];
    }

<<<<<<< HEAD
    public OrderedArray(int size) //overloaded constructor
=======
    public OrderedArray(int size) //constructor overload
>>>>>>> caa6293172fcd277bc61715c7ccc13e46e3228d4
    {
        values = new int[size];
        this.size = size;
    }

    public void setArray(int a)
    {

    }
}
