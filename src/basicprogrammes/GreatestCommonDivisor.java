package basicprogrammes;

import java.util.Scanner;

// Write a function that calculates the Greatest Common Divisor of 2 numbers.

public class GreatestCommonDivisor {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter two numbers - ");
            int a = sc.nextInt(), b = sc.nextInt();
            sc.close();
            System.out.println("Greatest Common Divisor of " + a + " and " + b + " is -> " + gcd(a, b));
      }

      public static int greatestCommonDivisor(int a, int b) {
            if (a <= 0 || b <= 0) {
                  System.out.println("Invalid Input!");
                  return 0;
            }
            int hcf = Math.min(a, b);
            while (hcf > 0) {
                  if (a % hcf == 0 && b % hcf == 0)
                        break;
                  hcf--;
            }
            return hcf;
      }

      // Euclidean Algorithm
      public static int gcd(int a, int b) {
            while (a != b) {
                  if (a > b)
                        a -= b;
                  else
                        b -= a;
            }
            return a;
      }

      public static int gcd_rec(int a, int b) {
            if (b == 0)
                  return a;
            return gcd_rec(b, a % b);
      }
}
