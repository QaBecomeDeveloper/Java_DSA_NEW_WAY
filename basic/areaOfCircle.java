package basic;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        double r = sc.nextDouble();
        Double Area;
        Area= 3.14*r*r;
        System.out.println(Area);

    }
}
