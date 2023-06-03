package loops;

import java.util.Scanner;

public class charpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide number");
        int n = sc.nextInt();
        char ch ='A';
        for (int line=1; line<=n;line++){
            for (int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
