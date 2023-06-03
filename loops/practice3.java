package loops;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int fact=1;
        System.out.println("provide number");
        number= sc.nextInt();
        for (int i=1;i<=number;i++){
            //fact*=i;
            //or
            fact =fact*i;
        }
        System.out.println("factorial :"+fact);

    }
}
