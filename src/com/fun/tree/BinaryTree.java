package com.fun.tree;

public class BinaryTree
{

    private BinaryTree root = null;
    private BinaryTree left = null;
    private BinaryTree right = null;
    private int value;

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public BinaryTree getLeft()
    {
        return left;
    }

    public void setLeft(BinaryTree left)
    {
        this.left = left;
    }

    public BinaryTree getRight()
    {
        return right;
    }

    public void setRight(BinaryTree right)
    {
        this.right = right;
    }

    public BinaryTree getRoot()
    {
        return root;
    }

    public void setRoot(BinaryTree root)
    {
        this.root = root;
    }
}
