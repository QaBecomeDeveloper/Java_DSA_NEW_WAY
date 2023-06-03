package Conditions;

import java.util.Scanner;

public class positiveOrnegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide number");
        int num = sc.nextInt();
        if (num >= 0) {
            System.out.println("number is Positive");
        } else {
            System.out.println("number is negative");
        }
    }
}
