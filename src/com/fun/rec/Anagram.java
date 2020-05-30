package com.fun.rec;

public class Anagram
{

    public static void main(String[] args)
    {

    }

    static void mainChange(int i, String input){
        if(i == input.length())
            return;
        subChange(input);
        mainChange(i++);
    }

    static void subChange(String init){
        System.out.print(init+ " ");
        StringBuilder res = new StringBuilder();
        while(!res.equals(init)){
            StringBuilder ano = res;
            res = new StringBuilder(init.charAt(0));
//            int j = 0;
            char tmp = init.charAt(1);
            for(int i = init.length(); i > 0; ++i)
                res.append(init.charAt(i));
            System.out.print(res.append(tmp));
        }
    }
}
