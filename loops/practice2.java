package loops;

import java.util.Scanner;

//sum of even number and sum of odd number until user provide 0
public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum =0;
        int oddsum =0;
        do{
            System.out.println("provide number");
            number=sc.nextInt();
            if (number%2==0){
                evensum +=number;
            }else {
                oddsum +=number;
            }
            System.out.println("Do you want to continue? press 1 or 0 for no ");
            choice= sc.nextInt();
        }while (choice==1);
        System.out.println("sum of even number is :"+evensum);
        System.out.println("sum of odd number is : "+oddsum);


    }
}
