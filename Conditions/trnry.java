package Conditions;

import java.util.Scanner;

public class trnry {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Give Number");
        int number =sc.nextInt();
        String type = ((number%2)==0)?"even":"odd";
        System.out.println(type);
    }

}
