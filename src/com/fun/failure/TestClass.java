/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code her
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int q = s.nextInt();
        String[] query;
        int[] arr = new int[size];

        for(int i = 0; i < size; ++i)
            arr[i] = s.nextInt();

        for(int i = 0; i < q; ++i){
            query = s.nextLine().split(" ");

            switch(query[0]){
                case "0":
                    System.out.println(
                            isOdd(Integer.parseInt(query[2]), arr) ?
                            "ODD" : "EVEN");
                    break;

                case "1":
                    flipValue(Integer.parseInt(query[1]), arr);
                    break;

            }
        }

    }

    static boolean isOdd(int second, int[] arr){
        return arr[second - 1] == 1;
    }

    static void flipValue(int index, int[] arr){
        arr[index] = arr[index] == 1 ? 0 : 1;
    }
}
