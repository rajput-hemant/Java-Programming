package pattern;

import java.util.Scanner;

public class SolidRhombus {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            sc.close();
            // for rows
            for (int i = 0; i < n; i++) {
                  // for spaces
                  for (int j = n-i; j > 0; j--)
                        System.out.print("  ");
                  // for stars
                  for (int j = 0; j < n; j++)
                        System.out.print("* ");
                  System.out.println();
            }
      }
      
}
