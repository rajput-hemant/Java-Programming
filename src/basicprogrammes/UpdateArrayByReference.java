package basicprogrammes;

import java.util.Scanner;

public class UpdateArrayByReference {
    void update(int []arr, int i, int v) {
        arr[i] = v;
    }
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        int index, value;
        System.out.print("Array before the updation=[");
        for (int i:A)
            System.out.print(i + ",");
        System.out.println("\b]");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Index of the Array=");
        index = sc.nextInt();
        System.out.print("Enter the Value=");
        value = sc.nextInt();
        sc.close();
        UpdateArrayByReference ob = new UpdateArrayByReference();
        ob.update(A, index, value);
        System.out.print("Array after the updation=[");
        for (int i:A)
            System.out.print(i + ",");
        System.out.println("\b]");
    }
}
