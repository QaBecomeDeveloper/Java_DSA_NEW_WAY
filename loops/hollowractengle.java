package loops;

import java.util.Scanner;

public class hollowractengle {
    public static void main(String[] args) {
        int rows, columns, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        columns = sc.nextInt();

        System.out.print("Rectangular star Pattern: \n\n");
        for (i = 1; i <= rows; i++)
        {
            for (j = 1; j <= columns; j++)
            {
                if (i == 1 || i == rows || j == 1 || j == columns)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
