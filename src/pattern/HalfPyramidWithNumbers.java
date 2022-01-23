package pattern;

import java.util.Scanner;

public class HalfPyramidWithNumbers {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Eneter the number of rows - ");
            int n = sc.nextInt();
            sc.close();
            // outer loop
            for (int i = 1; i <= n; i++) {
                  // inner loop
                  for (int j = 1; j <= i; j++) {
                        System.out.print(j+" ");
                  }
                  System.out.println();
            }  
      }
}
