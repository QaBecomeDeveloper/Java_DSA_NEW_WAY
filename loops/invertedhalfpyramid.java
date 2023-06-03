package loops;

import java.util.Scanner;

public class invertedhalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide number");
        int rows = sc.nextInt();
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
