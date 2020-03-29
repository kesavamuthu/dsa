package com.fun.order;

public class SubStringFinder
{

    /**
     * working one
     * @param a
     * @return
     */
    private static String subStringProvider(String a, int init){
       // int startIndexOfOne = -1;
       // int endIndexOfOne = 0;
        int k = 0;


     //   String[] parsedSubString = new String[a.length()];
        if(a.length() == 1){
           return "";
        }

        char[] tmp  = a.toCharArray();
       // endIndexOfOne = endIndexFinder(tmp);
        StringBuffer sb = null;
        aa:
        for(int i = init; i < tmp.length; ++i){
            if(tmp[i] == '1'){
//                if(startIndexOfOne < 0)
//                    startIndexOfOne = i;10101001
                sb = new StringBuffer();
                sb.append(tmp[i]);
                for(int j = i + 1; j < tmp.length; ++j){
                    if(tmp[j] == '1'){
                        sb.append(tmp[j]);
                        System.out.println(sb);
                        if(j < tmp.length - 1)
                        {
                            sb.append('@' + subStringProvider(a, j));
                            String[] ano = sb.toString().split("@");

                            for (int z = 1; z < ano.length; ++z)
                            {
                                System.out.println(ano[0] += firstCharRemover(ano[z]));
                            }
                        }
                      //  parsedSubString[k++] = sb.toString();
                        break aa;
                    }
                    else{
                        sb.append(tmp[j]);
                    }
                }
               // parsedSubString[k++] = sb.toString();
            }
        }
      /*  sb = new StringBuffer();
        for(int i = startIndexOfOne; i <= endIndexOfOne; ++i)
            sb.append(tmp[i]);
*/

        return sb.toString();
    }

  /*  private static int endIndexFinder(char[] input){
        for(int j = input.length - 1; j > -1; ++j)
            if(input[j] == '1')
                return j;

        return -1;
    }*/


 /*   private static String subString(String input, int init, int end){
        char[] tmp = new char[end - init];
        for(int i = 0; i < tmp.length; ++i)
            tmp[i] = input.charAt(init++);

        return tmp.toString();
    }*/

 private  static String firstCharRemover(String input){
     StringBuffer sb = new StringBuffer();
     for(int i = 1; i < input.length(); ++i)
         sb.append(input.charAt(i));

     return sb.toString();
 }

    public static void main(String[] args)
    {
        subStringProvider("10101001", 0);
    }
}
