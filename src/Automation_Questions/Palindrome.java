package Automation_Questions;

import java.util.Scanner;

/**
 * 5. Create function to verify if string == palindrome (“racecar” => true, “name” => false)
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Input your string: ");
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine().toString().toLowerCase();
        if (verifyPalindrom(myString))
            System.out.println("True");
        else System.out.println("False");
    }

    public static boolean verifyPalindrom(String myString) {
        boolean answer = false;
        for (int i = 0; i < myString.length() - 1; i++) {
            if (myString.charAt(i) == myString.charAt(myString.length() - 1 - i))
                answer = true;
            else answer = false;
        }
        return answer;
    }
}
