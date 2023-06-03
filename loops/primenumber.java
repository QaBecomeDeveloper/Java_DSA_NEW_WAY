package loops;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide number");
        int n = sc.nextInt();
        boolean isPrime=true;
        if (n==2){
            System.out.println(" n is prime number");
        }else {
            for (int i=2; i<=Math.sqrt(n);i++){
                if (n%i==0){ //n is multiple of i (i not equal to 1 or n)
                    isPrime=false;
                }
            }
            if (isPrime==true){
                System.out.println("number is prime");
            }else{
                System.out.println(" number is not prime");
            }
        }
        }

}
