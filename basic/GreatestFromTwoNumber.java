package basic;

import java.util.Scanner;

public class GreatestFromTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        double A=sc.nextDouble();
        System.out.println("Enter Second number");
        double B = sc.nextDouble();
        if (A>B){
            System.out.println(" A is Biggest");
        } else if (A<B) {
            System.out.println("B is biggest number");

        }
        if (A==B){
            System.out.println("Both Numbers or equal");
        }

    }
}
