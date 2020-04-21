package com.fun.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeNode
{

    public int data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int data)
    {
        this.data = data;
    }

    public BinaryTreeNode()
    {
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public BinaryTreeNode getLeft()
    {
        return left;
    }

    public void setLeft(BinaryTreeNode left)
    {
        this.left = left;
    }

    public BinaryTreeNode getRight()
    {
        return right;
    }

    public void setRight(BinaryTreeNode right)
    {
        this.right = right;
    }

    public static void main(String[] args)
    {

        int[] arr = { 1,
                      2,
                      3,
                      4,
                      5,
                      6,
                      7,
                      8 };
//      GenerateTree generateTree = new GenerateTree();
        BinaryTreeNode root = new BinaryTreeNode();
//      root = generateTree.insertLevelOrder(arr, root, 0);
//      Preorder pre = new Preorder();
//      pre.preOrder(root);

//      System.out.println(generateTree.HeightOfBT(root));
        root = root.insertLevelOrder(arr, root, 0);
        root.reversePrint(root);

    }

    public BinaryTreeNode insertLevelOrder(int[] arr,
                                           BinaryTreeNode root,
                                           int i)
    {
        if (i < arr.length)
        {
            BinaryTreeNode temp = new BinaryTreeNode(arr[i]);
            root = temp;

            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);

            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    void reversePrint(BinaryTreeNode root)
    {
        Stack<BinaryTreeNode> st = new Stack<>();
        Queue<BinaryTreeNode> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty())
        {
            BinaryTreeNode tmp = q.poll();
           if (tmp.right != null)
           {
              q.add(tmp.right);
           }
           if (tmp.left != null)
           {
              q.add(tmp.left);
           }
           st.push(tmp);
        }

       while (!st.isEmpty())
       {
          System.out.print(st.pop().data +" ");
       }
    }
}