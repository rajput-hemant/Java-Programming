package basicprogrammes;

import java.util.Scanner;

public class SumOfnElements {
    public static void main(String[] args) {
        int n, sum = 0;
        float avg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements=");
        n = sc.nextInt();
        int[] arr = new int[20];
        System.out.println("Enter the Numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg += arr[i];
        }
        sc.close();
// 'for' loop replaceable with enhanced 'for'
        /*
        for (int j : arr)
            sum += j;
         */
        System.out.println("The Sum and Average of "+n+" elements is= "+sum+" & "+(avg/n)+" respectively");
    }
}