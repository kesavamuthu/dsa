package com.fun.order;

import com.fun.order.OrderedArray;

class OrderedArrayApp
{

    public static void main(String[] args)
    {
        OrderedArray oa = new OrderedArray();

        for (int i = 20; i != 0; --i)
        {
            oa.setArrayValues(i);
        }
        oa.printArray();
        oa.insert(17);
       // oa.printArray();
        oa.delete(20);
        oa.delete(17);
       // oa.printArray();
    }
}