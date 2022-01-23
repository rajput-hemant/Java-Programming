package basicprogrammes;

import java.util.*;

public class IndianMailDomain {
    void checkMail(String str) {
        char[] ch = str.toCharArray();
        int len = str.length();
        if (ch[len-1] == 'n' && ch[len-2] == 'i' && ch[len-4] == 'c' && ch[len-5] == 'a')
            System.out.println("'" + str + " is an Academic Indian Mail Domain");
        else
            System.out.println("'" + str + "' isn't an Academic Indian Mail Domain");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IndianMailDomain cm = new IndianMailDomain();
        System.out.print("Enter your Email Address=");
        String str = sc.nextLine();
        sc.close();
        cm.checkMail(str);
    }
}
