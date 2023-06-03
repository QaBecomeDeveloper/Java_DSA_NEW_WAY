package Conditions;

import java.time.Year;
import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Provide Year");
        int year= sc.nextInt();
//        boolean x =(year%4)==0;
//        boolean y =(year%100)!=0;
//        boolean z = ((year%100 ==0) && (year%400==0));
//        if (x && (y||z)){
//            System.out.println(year + " : Is a Leap Year");
//        }else {
//            System.out.println(year + " : Is Not a Leep Year");
//        }
        if (year%4==0){
            if (year%100!=0){
                System.out.println(year + " : Is Leap Year");
            } else if (year%400==0) {
                System.out.println(year + " : Is Leap Year");
            }else {
                System.out.println(year + " : Is not a leap Year");
            }
        }else {
            System.out.println(year + " : Not a Leep Year");
        }


    }
}
