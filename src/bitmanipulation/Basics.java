package bitmanipulation;

import java.util.Scanner;

public class Basics {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Basics ob = new Basics();
            System.out.print("Enter the Number - ");
            int n = sc.nextInt();
            System.out.print("Enter the Position - ");
            int pos = sc.nextInt();
            int bitmask = 1 << pos; // left shift
            System.out.print("Which opertion do you want to perform?\n" +
                              "1 GetBit\n" +
                              "2 SetBit\n" +
                              "3 ClearBit\n" +
                              "4 Update Bit\n-> ");
            int op = sc.nextInt();
            switch(op) {
                  case 1:
                        ob.GetBit(n, pos, bitmask);
                        break;
                  case 2:
                        ob.SetBit(n, pos, bitmask);
                        break;
                  case 3:
                        ob.clearBit(n, pos, bitmask);
                        break;
                  case 4:
                        System.out.print("Do you want to update the bit to 1?\n" +
                                          "1 for yes\n" +
                                          "2 for no, set it to 0\n-> ");
                        int choice = sc.nextInt();
                        ob.updateBit(n, pos, bitmask, choice);
                        break;
                  default: System.out.println("Wrong Input!");
            }
            sc.close();
      }

      void GetBit(int n, int pos, int bitmask) {
                        if((bitmask & n) == 0)
                              System.out.println("Bit was 1");
                        else
                              System.out.println("Bit was 0");
      }

      void SetBit(int n, int pos, int bitmask) {
            System.out.println(bitmask | n);
      }

      void clearBit(int n, int pos, int bitmask) {
            System.out.println((~bitmask) & n);
      }

      void updateBit(int n, int pos, int bitmask, int op) {
            if (op == 1)
                  System.out.println(bitmask | n); // set
            else
                  System.out.println((~bitmask) & n); // clear
      }
}
