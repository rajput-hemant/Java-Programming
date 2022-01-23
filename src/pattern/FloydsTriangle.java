package pattern;

import java.util.Scanner;

public class FloydsTriangle {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Eneter the number of rows - ");
            int n = sc.nextInt();
            sc.close();
            // temp variable 
            int temp = 0;
            // outer loop
            for (int i = 1; i <= n; i++) {
                  // inner loop
                  for (int j = 1; j <= i; j++) {
                        temp++;
                        System.out.print(temp+" ");
                  }
                  System.out.println();
            }  
      }
}
