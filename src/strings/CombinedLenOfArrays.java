package strings;

// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;

public class CombinedLenOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter th size of the Array -> ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        int length = 0;
        System.out.println("Enter the Strings -> ");
        // taking string input
        for(int i = 0; i < size; i++) {
            arr[i] = sc.next();
            length += arr[i].length();
        }
        sc.close();
        System.out.println("Combined Length= " + length);
    }
}       
