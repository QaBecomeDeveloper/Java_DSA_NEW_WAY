package loops;

import java.util.Scanner;

public class invertedstar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("provide number");
        int n = sc.nextInt();
        for (int line=1; line<=n; line++){
            for (int Star=1;Star<=(n-line+1);Star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
