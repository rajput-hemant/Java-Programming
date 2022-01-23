package basicprogrammes;

import java.util.Scanner;

public class CheckIfEqual {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to compare?\nType - A or for Array\n       S or s for String");
        char ch = sc.next().charAt(0);
        if(ch == 'A' || ch =='a') {
            System.out.print("Enter the Length of the Array=");
            int n = sc.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            System.out.print("Enter the First array=");
            for (int i = 0; i < n; i++)
                A[i] = sc.nextInt();
            System.out.print("Enter the Second array=");
            for (int i = 0; i < n; i++)
                B[i] = sc.nextInt();
                sc.close();
            checkEqualArray(A, B, n);
        }
        else {
            System.out.print("Enter the First String=");
            String str1 = sc.nextLine();
            System.out.print("Enter the Second String=");
            String str2 = sc.nextLine();
            sc.close();
            checkEqualString(str1, str2);
        }
    }

    // Method to check if two Arrays are equal
    static void checkEqualArray(int []arr1, int []arr2, int len) {
        int flag = 0;
        for (int i = 0;i < len;i++) {
            if (arr1[i] != arr2[i])
            {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Arrays are not equal");
        else
            System.out.println("Arrays are equal");
    }

    // Method to check if two Strings are equal
    static void checkEqualString(String A, String B) {
        System.out.println("Equality of " + A + " and " + B
                + " is: " + A.equals(B));
    }

}
