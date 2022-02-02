package sorting;

import java.util.Scanner;

public class BubbleSort {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of the Array -> ");
            int len = sc.nextInt();
            int[] arr = new int[len];
            System.out.print("Enter the elements -> ");
            for (int i = 0; i < len; i++)
                  arr[i] = sc.nextInt();
            System.out.print("1 for Ascending\n" +
                              "2 for Descending\n" +
                              "Choose -> ");
            int sort = sc.nextInt();
            // Bubble Sort -> Time Compelexity = O(n^2)
            for (int i = 0; i < len-1; i++) {
                  for (int j = 0; j < len-1-i; j++) {
                        int temp = 0;
                        // For sorting in Ascending Order
                        if(sort == 1) {
                              if(arr[j] > arr[j+1]) {
                                    temp = arr[j+1];
                                    arr[j+1] =  arr[j];
                                    arr[j] = temp;
                              }
                        }
                        // For Sorting in Descending Order
                        else {
                              if(arr[j] < arr[j+1]) {
                                    temp = arr[j+1];
                                    arr[j+1] =  arr[j];
                                    arr[j] = temp;
                              }
                        }
                  }
            }
            System.out.print("Array after Sorting -> ");
            for (int i : arr)
                  System.out.print(i + " ");
            sc.close();
      }
}
