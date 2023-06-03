package loops;

import java.util.Scanner;

public class printnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("provide range");
        int range = sc.nextInt();
        int counter =1;
        while (counter<=range){
            System.out.print(counter+ " ");
            counter++;

        }
        System.out.println();
    }
}
