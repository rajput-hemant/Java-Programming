package basicprogrammes;

import java.util.Scanner;

public class DivisorsOfNum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Number -> ");
        int n = sc.nextInt();
        printDivisors3(n);
    }

    public static void printDivisors(int n) {
        // Approach 1
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.println(i);
    }

    // Approach 2 -> Unsorted
    public static void printDivisors2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i)
                    System.out.println(n / i);
            }
        }
    }

    // Approach 3 -> Sorted
    public static void printDivisors3(int n) {
        int i;
        for (i = 1; i * i < n; i++)
            if (n % i == 0)
                System.out.println(i);
        for (; i >= 1; i--)
            if (n % i == 0)
                System.out.println(n / i);
    }
}
