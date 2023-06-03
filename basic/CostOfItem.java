package basic;

import java.util.Scanner;

public class CostOfItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost of pencil");
        float P1 = sc.nextFloat();
        System.out.println("Enter Cost Of pen");
        float P2= sc.nextFloat();
        System.out.println("Enter Cost of Eraser");
        float E1=sc.nextFloat();
        float T=P1+P2+E1;
        System.out.println("Total Cost of item :" + T);
        System.out.println("Enter Gst Applicable on Total Cost");
        float Gst = sc.nextFloat();
        float T1=T % Gst;
        System.out.println("Cost Increase After Apply GST : "+T1);
        float T2=T1+T;
        System.out.println("Total Bill including GST : "+T2);
    }
}
