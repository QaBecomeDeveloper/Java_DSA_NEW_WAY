package Conditions;

import java.util.Scanner;

public class StuPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide Marks");
        int Marks = sc.nextInt();
        String reportCard = Marks>=30 ? "Pass" : "Fail";
        System.out.println(reportCard);
    }
}
