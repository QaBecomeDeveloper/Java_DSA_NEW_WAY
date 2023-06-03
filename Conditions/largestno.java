package Conditions;

import java.util.Scanner;

public class largestno {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("provide A");
        int A = sc.nextInt();
        System.out.println("provide B");
        int B = sc.nextInt();
        System.out.println("Provide C");
        int C = sc.nextInt();
        if(A>=B && A>=C){
            System.out.println("A is Largest :" +A);
        } else if (B>=C) {
            System.out.println("B is Largest :" +B);
        }
        else {
            System.out.println("C is Largest :" +C);
        }
    }
}
