package strings;

import java.util.Scanner;

/*
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”
*/

public class UsernameFromEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mail = sc.next();
		sc.close();
        String username = "";
        for (int i = 0; i < mail.length(); i++) {
            if(mail.charAt(i) == '@')
                    break;
            else
                    username += mail.charAt(i);
		}
		System.out.println(username);
	}
}
