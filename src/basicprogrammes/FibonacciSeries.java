package basicprogrammes;

import java.util.Scanner;

/*
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
*/

public class FibonacciSeries {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of Fibonacci Series - ");
            int n = sc.nextInt();
            sc.close();
            System.out.print("Fibonacci Series - ");
            fibonacci(n);
            // System.out.print("\nFibonacci Series using Recursion - ");
            // recFibonacci(n , 0, 1);
      }
      // Using Recursion
      static void recFibonacci (int n, long a, long b) {
            if(n < 1)
                  return;
            System.out.print(a + " ");
            recFibonacci(n-1, b, a+b);
      }
      // Using For Loop
      static void fibonacci(int n) {
            int a = 0, b = 1, sum  = 0;
            if (n == 0)
                  System.out.println("Invalid Input!");
            else {
                  for (int i = 1; i <= n; i++) {
                        System.out.print(sum + " ");
                        a = b;
                        b = sum;
                        sum = a + b;
                  }
            }
      }
}
