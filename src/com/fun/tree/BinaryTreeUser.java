package com.fun.tree;

public class BinaryTreeUser
{

    public static void main(String[] args)
    {
        BinaryTree root = null;
        int[] arr = { 1,
                      2,
                      3,
                      4,
                      5,
                      6,
                      7 };
        BinaryTree tmp = new BinaryTree();
        for (int i = 0; i < arr.length; )
        {
            //  tmp = new BinaryTree();
            if (tmp.getRight() != null && tmp.getLeft() != null)
            {
                tmp = tmp.getLeft();
            }
            if (root == null)
            {
                root = tmp;
                tmp.setValue(arr[i]);
                tmp.setRoot(tmp);
            }
            if (tmp.getLeft() == null)
            {
                tmp.setLeft(new BinaryTree());
                tmp.getLeft().setValue(arr[leftChildNode(i)]);
            }
            if (tmp.getRight() == null)
            {
                tmp.setRight(new BinaryTree());
                tmp.getRight().setValue(arr[rightChildNode(i)]);
            }

        }
    }

    private static int leftChildNode(int i)
    {
        return 2 * i + 1;
    }

    private static int rightChildNode(int j)
    {
        return 2 * i + 2;
    }
}
