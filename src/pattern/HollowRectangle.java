package pattern;

import java.util.*;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows - ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns - ");
        int cols = sc.nextInt();
        sc.close();
        // outer loop
        for (int i = 1; i <= rows; i++) {
            // inner loop
            for (int j = 1; j <= cols; j++) {
                  if(i==1 || j==1 || i ==rows || j==cols)
                        System.out.print("* ");
                  else
                        System.out.print("  ");
            }
            System.out.println();
        }
    }
}
