package basicprogrammes;

import java.util.*;

public class CountVarInString {
    void countVar(String str) {
        int count = 0;
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i'
            || ch[i] == 'o' || ch[i] == 'u') {
                count++;
            }
        }
        System.out.println("Total no. of vowels in '" + str + "' are=" + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string= ");
        CountVarInString cv = new CountVarInString();
        String str = sc.nextLine();
        sc.close();
        cv.countVar(str);
    }
}
