package strings;

import java.util.Scanner;

// Java Program to Get a Character From the Given String

public class GetCharFromString {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the String = ");
            // taking string input 
            String str = sc.next();
            // sc.next();
            System.out.print("Enter the index of the Char = ");
            int i = sc.nextInt();
            sc.close();
            if(i < str.length())
                  System.out.println("Character at index " + i +" is = " + str.charAt(i));
            else
                  System.out.println("Out of Range, Enter a lower value!");
            
      } 
}