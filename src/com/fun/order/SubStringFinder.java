package com.fun.order;

public class SubStringFinder
{

    /**
     * it won't work for to get all of these outputs will fix it in future.
     *
     * 0100010101
     *
     * 10001 1000101 100010101
     * 101 101 10101
     *
     * 111111
     *
     * 11 11 11 11 11 111 111 111 111 1111 1111 1111 11111 11111 111111
     * @param a
     * @return
     */
    private static String[] subStringProvider(String a){
        int startIndexOfOne = -1;
        int endIndexOfOne = 0;
        int k = 0;


        String[] parsedSubString = new String[a.length()];
        if(a.length() == 1){
            parsedSubString[0] = a;
            return parsedSubString;
        }

        char[] tmp  = a.toCharArray();
        endIndexOfOne = endIndexFinder(tmp);
        StringBuffer sb;
        for(int i = 0; i < tmp.length; ++i){
            if(tmp[i] == '1'){
                if(startIndexOfOne < 0)
                    startIndexOfOne = i;
                sb = new StringBuffer();
                sb.append(tmp[i]);
                for(int j = i + 1; j <= endIndexOfOne; ++j){
                    if(tmp[j] == '1'){
                        sb.append(tmp[j]);
                        break;
                    }
                    else{
                        sb.append(tmp[j]);
                    }
                }
                parsedSubString[k++] = sb.toString();
            }
        }
        sb = new StringBuffer();
        for(int i = startIndexOfOne; i <= endIndexOfOne; ++i)
            sb.append(tmp[i]);
        parsedSubString[k] = sb.toString();

        return parsedSubString;
    }

    private static int endIndexFinder(char[] input){
        for(int j = input.length - 1; j > -1; ++j)
            if(input[j] == '1')
                return j;

        return -1;
    }
}
