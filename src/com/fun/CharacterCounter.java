package com.fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CharacterCounter

{

    public static void main(String[] args)
            throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; ++i)
        {
            System.out.println(finder(br.readLine()));
        }
    }

    static String finder(String input)
    {
        HashMap<Character, Integer> hs = new LinkedHashMap<>();
        StringBuffer sb = new StringBuffer();
        int count = 0;
        ArrayList<HashMap<Character, Integer>> al = new ArrayList<>();
        for (int i = 0; i < input.length(); ++i)
        {
            if (hs.containsKey(input.charAt(i)))
            {
                hs.put(input.charAt(i), ++count);
            }
            else
            {
                al.add(hs);
                count = 0;
                hs = new LinkedHashMap<>();
                hs.put(input.charAt(i), ++count);
            }
        }
        al.add(hs);

        for(HashMap<Character, Integer> hm : al)
        for (Map.Entry<Character, Integer> entry : hm.entrySet())
        {
            sb.append(entry.getKey() + "" + entry.getValue());
        }

        return sb.toString();
    }

}
