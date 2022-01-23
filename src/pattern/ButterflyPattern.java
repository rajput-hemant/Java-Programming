package pattern;

import java.util.Scanner;


public class ButterflyPattern {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            sc.close();
            // upper half
            for (int i = 1; i <= n/2; i++) {
                  for (int j = 1; j <=i  ; j++)
                        System.out.print("* ");
                  for (int j = 1; j <= n-2*i; j++)
                        System.out.print("  ");
                  for (int j = 1; j <= i ; j++)
                        System.out.print("* ");
                  System.out.println();
            }
            //  to print a line of stars if n is odd
            if (n%2 != 0) {
                  for (int i = 0; i < n ; i++) 
                        System.out.print("* ");
                  System.out.println();
            }
            // lower half
            for (int i = n/2; i >= 1; i--) {
                  for (int j = 1; j <=i  ; j++)
                        System.out.print("* ");
                  for (int j = 1; j <= n-2*i; j++)
                        System.out.print("  ");
                  for (int j = 1; j <= i ; j++)
                        System.out.print("* ");
                  System.out.println();
            }
      }
}
