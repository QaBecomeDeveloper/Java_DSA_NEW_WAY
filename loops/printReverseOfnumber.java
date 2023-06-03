package loops;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class printReverseOfnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("provide number");
        int n = sc.nextInt();
        while (n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n =n/10;

        }
    }
}
