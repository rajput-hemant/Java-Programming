package sorting;

import java.util.Scanner;

public class SelectionSort {
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
            // Selection Sort -> Time Compelexity = O(n^2)
            for (int i = 0; i < len-1; i++) {
                  int swapVal = i;
                  for (int j = i+1; j < arr.length; j++) {
                        // For sorting in Ascending Order
                        if(sort == 1) {
                              if(arr[swapVal] > arr[j])
                                    swapVal = j;
                        }
                        // For Sorting in Descending Order
                        else {
                              if(arr[swapVal] < arr[j])
                                    swapVal = j;
                        }
                  }
                  int temp = arr[swapVal];
                  arr[swapVal] =  arr[i];
                  arr[i] = temp;
            }
            System.out.print("Array after Sorting -> ");
            for (int i : arr)
                  System.out.print(i + " ");
            sc.close();
      }
}
