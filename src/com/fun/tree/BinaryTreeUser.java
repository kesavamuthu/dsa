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
        for (int i = 0; i <= arr.length / 3; ++i)
        {
            //  tmp = new BinaryTree();
           /* if (tmp.getRight() != null && tmp.getLeft() != null)
            {
                tmp = tmp.getLeft();
            }*/
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
                tmp.getLeft().setRoot(tmp.getLeft());
            }
            if (tmp.getRight() == null)
            {
                tmp.setRight(new BinaryTree());
                //i = ;
                tmp.getRight().setValue(arr[rightChildNode(i)]);
                tmp.getRight().setRoot(tmp.getRight());
            }

            if(i % 2 == 0)
                tmp = tmp.getLeft();
            else
                tmp = tmp.getRight();

        }
        inorderTraversal(root);

    }

    private static int leftChildNode(int i)
    {
        return 2 * i + 1;
    }

    private static int rightChildNode(int j)
    {
        return 2 * j + 2;
    }

    public static void inorderTraversal(BinaryTree node){
        if(node == null)
            return;
        System.out.println(node.getRoot().getValue());
        inorderTraversal(node.getLeft());
        inorderTraversal(node.getRight());
    }
}
