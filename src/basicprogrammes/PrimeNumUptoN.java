package basicprogrammes;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumUptoN {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Number -> ");
        int n = sc.nextInt();
        primeNumUptoN3(n);
    }

    // Approach 1
    public static void primeNumUptoN(int n) {
        for (int i = 2; i <= n; i++)
            if (CheckIfPrimeNumber.checkIfPrimeNumber3(i))
                System.out.println(i);
    }

    // Approach 2 -> Sieve Of Eratosthenes
    public static void primeNumUptoN2(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i)
                    isPrime[j] = false;
            }
        }
        for (int i = 2; i <= n; i++)
            if (isPrime[i])
                System.out.println(i);
    }

    // Approach 2 -> Sieve Of Eratosthenes (with Shorter Code)
    public static void primeNumUptoN3(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                for (int j = i * i; j <= n; j += i)
                    isPrime[j] = false;
            }
        }
    }
}
