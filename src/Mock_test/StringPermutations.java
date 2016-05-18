package Mock_test;

//Generate all permutations of a given String
//abc
//public class StringPermutations {
//    public static String permutate(String string) {
//        StringBuilder sb = new StringBuilder();
//        char [] charString = string.toCharArray();
//        sb.append(string).append(",");
//        for (int i = 0; i < charString.length; i++){
//            for (int j = i + 1; j <= charString.length; j ++){
//
//            }
//
//        }
//    }
//}

import java.util.Arrays;

public class StringPermutations {
    public static void permutate(String str) {
        //calling recursion
        permutation("", str);

        //caling iteration
        System.out.println("_________");
        char[] temp = str.toCharArray();
        // Step 1. Sort the string
        Arrays.sort(temp);
        System.out.println("String " + String.valueOf(temp));
        int index = 0;
        int lowest = 0;
        while (true) {
            // Step 2. Rightmost char smallest than its neighbour
            for (int i = 0; i < temp.length - 1; i++) {
                if (temp[i] < temp[i + 1]) {
                    lowest = i;

                }
            }
            // index of CHAR1
            index = lowest;
            // Step3. Find the ceiling of the
            int j = findCeiling(temp, index);
            // Breaking condition at this juncture
            // all permutations are printed
            if (j == index) break;

            swap(temp, index, j);
            String a = String.valueOf(temp);
            // Step4. Sort the substring
            char[] b = a.substring(index + 1).toCharArray();
            Arrays.sort(b);
            a = a.substring(0, index + 1) + String.valueOf(b);
            temp = a.toCharArray();
            System.out.println("String " + String.valueOf(temp));
            //}
        }

    }

    //using in iteration
    public static int findCeiling(char[] temp, int index) {
        int k = index;
        char test = temp[index];
        while (k < temp.length - 1) {
            if (temp[index] < temp[k + 1]) {
                index = k + 1;
                break;
            }
            k++;
        }
        k = index;
        while (k < temp.length - 1) {
            if ((temp[index] > temp[k + 1]) && (temp[k + 1] > test)) {
                index = k + 1;
            }
            k++;
        }
        return index;
    }

    //using in iteration
    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    //using recursion
    private static void permutation(String ans, String remain) {
        int n = remain.length();
        // ans serves as an accumulator variable
        // base case: we print out ans since there are no more letters to be added
        if (n == 0) {
            System.out.println(ans);
        }
        // recursive case
        else {
            for (int i = 0; i < n; i++) {
                // we call permutation, each time combining prefix with the individual letters in str
                // we also remove these letters from str
                permutation(ans + remain.charAt(i), remain.substring(0, i) + remain.substring(i + 1, n));
            }
        }
    }
}