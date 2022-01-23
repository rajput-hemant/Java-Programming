package pattern;

import java.util.Scanner;

public class InvertedHalfPyramid {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Eneter the number of rows - ");
            int n = sc.nextInt();
            sc.close();
            // outer loop
            for (int i = 0; i < n; i++) {
                  // inner loop
                  for (int j = 0 ; j < n-i; j++) {
                        System.out.print("* ");
                  }
                  System.out.println();
            }  
      }
}
