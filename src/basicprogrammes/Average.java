package basicprogrammes;

import java.util.Scanner;

// Enter 3 numbers from the user & make a function to print their average.

public class Average {
    static float average(int[] arr, int n) {
        float avg = 0;
        for (int i = 0; i < arr.length; i++)
            avg += arr[i];
        return avg/n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to calculate the average of - ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Numbers - ");
        for (int i = 0; i < n; i ++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println("Average is - " + average(arr, n));
    }
}
