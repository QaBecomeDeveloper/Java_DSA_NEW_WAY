package Conditions;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide a");
        int a = sc.nextInt();
        System.out.println("provide b");
        int b = sc.nextInt();
        System.out.println("Enter Operator");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '%' :
                System.out.println(a%b);
                break;
            default:
                System.out.println("Not advance calculator");
        }

    }
}
