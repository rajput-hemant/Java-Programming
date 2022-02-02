package sorting;

import java.util.Scanner;

public class InsertionSort {
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
            // Insertion Sort -> Time Complexity = O(n^2)
            for (int i = 1; i < arr.length; i++) {
                  int current = arr[i];
                  int j = i-1;
                  // Sorting in Ascending Order
                  if(sort == 1) {
                        // This loop pushes bigger element backward to make room for smaller element
                        while(j >= 0 && current < arr[j]) {
                              arr[j+1] = arr[j];
                              j--;
                        }
                  }
                  // Sorting in Descending Order
                  else {
                        // This loop pushes smaller element backward to make room for bigger element
                        while(j >= 0 && arr[j] < current) {
                              arr[j+1] = arr[j];
                              j--;
                        }
                  }
                  // Placing the current value
                  arr[j+1] = current;
            }
            System.out.print("Array after sorting -> ");
            for (int i : arr)
                  System.out.print(i + " ");
            sc.close();
      }
}
