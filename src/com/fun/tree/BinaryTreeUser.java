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
        System.out.println("Preorder : using recursion");
        bt.preOrderTraversal(0);
        System.out.println("\nPost order :");
        bt.postOrderTraversal(0);
        System.out.println("\nIn order :");
        bt.inOrderTraversal(0);
        System.out.println("\nLevel order :");
        bt.levelOrderTraversal();
        System.out.println("\nLevel order : using recursion ");
        bt.levelOrderTraversalUsingRecursion(1, 0);

    }
}
