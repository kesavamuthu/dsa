package com.fun.stack;

import java.util.Stack;

public class LongestValidParenthesis
{

    public static int longestValidParenthesis(String input)
    {
        int res = 0;
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < input.length(); ++i)
        {
            if (input.charAt(i) == ')')
            {
                if (!stack.isEmpty() && stack.peek()[0] == 0)
                {
                    stack.pop();
                    res = Math.max(res, i - (stack.isEmpty() ? -1 : stack.peek()[1]));
//                    System.out.println(res);
                }
                else
                {
                    stack.push(new int[]{ 1,
                                          i });
                }
            }
            else
            {
                stack.push(new int[]{ 0,
                                      i });
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        System.out.println(longestValidParenthesis("()(())"));
    }
}
