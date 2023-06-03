package basic;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int s1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int  s2= sc.nextInt();
        int AreaOfSquare=s1*s2;
        System.out.println("Area of Square :" + AreaOfSquare);
    }

}
