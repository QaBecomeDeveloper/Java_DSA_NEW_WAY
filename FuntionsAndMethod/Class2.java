package FuntionsAndMethod;

import java.util.Scanner;

public class Class2 {

    public static int calculateSum(int num1, int num2){
        int sum = num1+num2;
        return sum;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide First number");
        int a =sc.nextInt();
        System.out.println("provide Second number");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum of two number is :"+sum);


    }
}
