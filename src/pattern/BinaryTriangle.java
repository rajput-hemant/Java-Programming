package pattern;

import java.util.Scanner;

public class BinaryTriangle {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Eneter the number of rows - ");
            int n = sc.nextInt();
            sc.close();
            // outer loop
            for (int i = 1; i <= n; i++) {
                  // inner loop
                  for (int j = 1; j <= i; j++) {
                        if((i+j)%2==0)
                              System.err.print("1 ");
                        else
                              System.out.print("0 ");
                  }
                  System.out.println();
            }  
      }
}
