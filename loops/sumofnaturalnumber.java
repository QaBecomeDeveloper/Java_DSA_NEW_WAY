package loops;

import java.util.Scanner;

public class sumofnaturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide range");
        int n = sc.nextInt();
        int sum =0;
        int i=1;
        while (i<=n){
            sum=sum+i;
            i++;
        }
    }
}
