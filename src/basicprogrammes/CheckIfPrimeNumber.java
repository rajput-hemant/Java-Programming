package basicprogrammes;

import java.util.Scanner;

public class CheckIfPrimeNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Number -> ");
        int n = sc.nextInt();
        System.out.println("Is " + n + " a Prime Number -> " + checkIfPrimeNumber2(n));
    }

    // Approach 1
    public static boolean checkIfPrimeNumber(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Approach 2
    public static boolean checkIfPrimeNumber2(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Approach 3
    public static boolean checkIfPrimeNumber3(int n) {
        if (n == 2 || n == 3)
            return true;
        if (n == 1 || n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
