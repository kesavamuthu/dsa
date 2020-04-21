package com.fun.tree;

public class BinaryTreeUser
{

    public static void main(String[] args)
    {
        BinaryTree bt = new BinaryTree();

        for (int i = 1; i < 12; ++i)
        {
            bt.add(i);
        }
        //int[] arr = bt.getAll();

      /*  for(int a : arr)
        System.out.print(a + " ");*/

        bt.preOrderTraversal(0);
        System.out.println();
        bt.postOrderTraversal(0);
        System.out.println();
        bt.inOrderTraversal(0);
        System.out.println();
        bt.levelOrderTraversal();
    }
}
