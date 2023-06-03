package basic;

import java.util.Scanner;

public class test2 {

    //find vowels in string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String A = sc.next();
        System.out.println(stringContainsVowels(A));
        System.out.println("Enter Second String");
          String B = sc.next();
         System.out.println(stringContainsVowels(B));
    }

    public static boolean stringContainsVowels(String input) {
    return input.toLowerCase().matches(".*[aeiou].*");

    }
}
