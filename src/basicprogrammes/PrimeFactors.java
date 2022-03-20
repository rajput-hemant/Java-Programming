package basicprogrammes;

import java.util.Scanner;

public class PrimeFactors {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Number -> ");
        int n = sc.nextInt();
        primeFactors3(n);
    }

    // Approach 1
    public static void primeFactors(int n) {
        for (int i = 2; i < n; i++) {
            if (CheckIfPrimeNumber.checkIfPrimeNumber3(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.println(i);
                    x *= i;
                }
            }
        }
    }

    // Approach 2
    public static void primeFactors2(int n) {
        if (n <= 1)
            return;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if (n > 1)
            System.out.println(n);
    }

    // Approach 3
    public static void primeFactors3(int n) {
        if (n <= 1)
            return;
        while (n % 2 == 0) {
            System.out.println(2);
            n /= 2;
        }
        while (n % 3 == 0) {
            System.out.println(3);
            n /= 2;
        }
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
            while (n % (i + 2) == 0) {
                System.out.println(i + 2);
                n /= i + 2;
            }
        }
        if (n > 3)
            System.out.println(n);
    }
}
