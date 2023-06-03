package basic;

import java.util.Scanner;

public class AvgOf3No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int A = sc.nextInt();
        System.out.println("Enter Second Number");
        int B = sc.nextInt();
        System.out.println("Enter Third number");
        int C = sc.nextInt();
        int Avg = (A+B+C)/3;
        System.out.println("Avg of Three numbers :" + Avg);
    }
}
