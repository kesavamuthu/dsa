package com.fun.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetCounter
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; ++i)
            System.out.println(finder(br.readLine()));
    }

    static String finder(String input){
        StringBuffer sb = new StringBuffer();


        Alphabet[] st = new Alphabet[26];
        Alphabet first = new Alphabet();
        int j = 0;
        int i = 0;
        for(; i < input.length() - 1; ++i){
            if(first.a == '\0'){
                st[j++] = first;
                first.a = input.charAt(i);
                first.count++;
            }
            else if(first.a == input.charAt(i))
                first.count++;
            if(first.a != input.charAt(i + 1))
                first = new Alphabet();
        }
        if(input.charAt(i) != first.a){
            first = new Alphabet();
            first.a = input.charAt(i);
            first.count++;
            st[j] = first;
        }
        else
            first.count++;

        for(Alphabet tmp : st)
            if(tmp == null)
                break;
            else
            sb.append(tmp.a +"" + tmp.count);

        return sb.toString();
    }
}

class Alphabet{
    int count = 0;
    char a = '\0';
}