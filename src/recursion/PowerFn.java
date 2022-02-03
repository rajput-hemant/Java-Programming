package recursion;

import java.util.Scanner;

public class PowerFn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vlaues for X and N i.e x^n -> ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(x + " raise to the power " + n + " is -> " + power(x, n));
        sc.close();
    }
    // This recursion function of power has Stack Height -> n
    static int power(int x, int n) {
        // base classes
        if(x == 0)
            return 0;
        if(n == 0)
            return 1;
        return x * power(x, n-1);
    }
    // This recursion function of power has Stack Height -> logn
    static int power2(int x, int n) {
        // base classes
        if(x == 0)
            return 0;
        if(n == 0)
            return 1;
        if(n % 2 == 0) // if n is even
            return power2(x, n/2) * power2(x, n/2);
        else // if n is odd
            return x * power2(x, n/2) * power2(x, n/2);
    }
}
