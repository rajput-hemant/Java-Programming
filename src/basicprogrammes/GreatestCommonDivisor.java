package basicprogrammes;

import java.util.Scanner;

// Write a function that calculates the Greatest Common Divisor of 2 numbers.

public class GreatestCommonDivisor {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter two numbers - ");
            int a = sc.nextInt(), b = sc.nextInt();
            sc.close();
            System.out.println("Greatest Common Divisor of " + a + " and " + b + " is - " + gcd(a, b));
      }

      static int gcd( int a ,int b) {
            int hcf = 0;
            if ( a <= 0 || b <= 0){
                  System.out.println("Invalid Input!");
                  return 0;
            } else {
                  for (int i = 1; i <= Math.min(a, b); i++) {
                        if ( a % i == 0 && b % i ==0)
                              hcf = i;
                  }
            }
            return hcf;
      }
}
