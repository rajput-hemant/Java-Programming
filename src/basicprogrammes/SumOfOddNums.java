package basicprogrammes;

import java.util.Scanner;

// Write a function to print the sum of all odd numbers from 1 to n.

public class SumOfOddNums {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n - ");;
            int n = sc.nextInt();
            sc.close();
            System.out.println("Sum of all Odd Number from 1 to " + n + " is - " + sumOfOddNum(n));
      }

      static int sumOfOddNum(int n) {
            int temp = 0;
            for (int i = 1; i <= n; i++) {
                  if (i%2 != 0)
                        temp += i;
            }
            return temp;
      }
}
