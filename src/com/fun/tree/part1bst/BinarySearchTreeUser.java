package com.fun.tree.part1bst;

import java.util.ArrayList;
import java.util.Random;

public class BinarySearchTreeUser
{

    /**
     * will do all basic operations in binary tree
     */
    static BinarySearchTree root = null;

    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Random ran = new Random();
        int a = 0;
        insertNode(6);
        for (int i = 1; i < 10; ++i)
        {
          //  a = ran.nextInt(3000);
            al.add(i);
            root = insertNode(i);
        }
        //System.out.println(al);
        inOrderTraversal(root);
    }

    static BinarySearchTree insertNode(int a)
    {

        if (root == null)
        {
            root = new BinarySearchTree(a);
            return root;
        }
        BinarySearchTree current = root;
        BinarySearchTree parent = root;
        while (true)
        {
            parent = current;
            if (current.data > a)
            {
                current = current.left;
                if (current == null)
                {
                    parent.left = new BinarySearchTree(a);
                    break;
                }
            }
            else
            {
                current = current.right;
                if (current == null)
                {
                    parent.right = new BinarySearchTree(a);
                    break;
                }
            }

        }

        return root;
    }

    static void inOrderTraversal(BinarySearchTree root)
    {
        if (root != null)
        {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
}


class BinarySearchTree
{

    BinarySearchTree right = null;
    BinarySearchTree left = null;
    int data;

    BinarySearchTree(int a)
    {
        data = a;
    }
}
