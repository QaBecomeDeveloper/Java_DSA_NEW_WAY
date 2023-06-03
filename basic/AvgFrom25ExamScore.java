package basic;

import java.util.Scanner;

public class AvgFrom25ExamScore {
    public static void main(String[] args) {
        double sum =0,c=0;
        double Avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Score");
        double S = sc.nextDouble();
        sum = sum +1;
        c=c+1;
        if (c==25){
            Avg=sum/25;
            System.out.println(Avg);

        }

        }

    }