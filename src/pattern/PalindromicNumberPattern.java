package pattern;

import java.util.Scanner;

public class PalindromicNumberPattern {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            sc.close();
            // for rows
            for (int i = 1; i <= n; i++) {
                  // for spaces
                  for (int j = 1; j <= n-i; j++)
                        System.out.print("  ");
                  // for numbes in first half
                  for (int j = i; j > 0; j--)
                        System.out.print(j+" ");
                  // for number in second half
                  for (int j = 2; j <= i; j++)
                        System.out.print(j+" ");
                  System.out.println();
            }
      }
}
