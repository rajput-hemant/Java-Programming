package basicprogrammes;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        float avg = 0;
        System.out.println("Enter the Numbers:");
        for (int i = 0; i < 5; i ++) {
        arr[i] = sc.nextInt();
        avg += arr[i];
        }
        sc.close();
        System.out.println("Average is:" + avg/5);
    }
}
