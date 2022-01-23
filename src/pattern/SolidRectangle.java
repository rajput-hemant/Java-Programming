package pattern;

import java.util.*;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows - ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns - ");
        int cols = sc.nextInt();
        sc.close();
        // outer loop
        for (int i = 0; i < rows; i++) {
            // inner loop
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
