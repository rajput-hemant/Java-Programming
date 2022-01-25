package basicprogrammes;

import java.util.Scanner;

// Write a function which takes in 2 numbers and returns the greater of those two.

public class GreatestInTwoNum {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter two numbers - ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.close();
            System.out.println("Greater number is - " + greaterInTwoNum(a, b));
      }     
      
      static int greaterInTwoNum(int a, int b) {
            if (a > b)
                  return a;
            else
                  return b;
      }
}
