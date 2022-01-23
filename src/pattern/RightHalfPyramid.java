package pattern;

import java.util.Scanner;

public class RightHalfPyramid {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Eneter the number of rows - ");
            int n = sc.nextInt();
            sc.close();
            // outer loop
            for (int i = 0; i < n; i++) {
                  // inner loop -> for printing spaces
                  for (int j = 0; j < n-i-1; j++) {
                        System.out.print("  ");
                  }
                  // inner loop -> for printing stars
                  for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                  }
                  System.out.println();
            }  
      }
}
