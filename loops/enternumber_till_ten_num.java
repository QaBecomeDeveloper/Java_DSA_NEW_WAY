package loops;

import java.util.Scanner;

public class enternumber_till_ten_num {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        do {
            System.out.println("provide data");
            int n = sc.nextInt();
            if (n%10==0){
                break;
            }
            System.out.println(n);
        }while (true);
    }
}
