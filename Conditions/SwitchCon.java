package Conditions;

import java.util.Scanner;

public class SwitchCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide number");
        int number = sc.nextInt();
        switch (number){
            case 1 :
                System.out.println("Samosa");
                break;
            case 2 :
                System.out.println("Burger");
                break;
            case 3 :
                System.out.println("Mango Shake");
                break;
            default:
                System.out.println("we week up");
        }
    }
}
