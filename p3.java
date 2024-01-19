// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a program to validate the entered password. The password must have one capital letter, one digit and one special character from {$, #, %} set. The length of password must be at least 8 characters. The program should display “Password is Valid” If the password satisfies above criteria, otherwise it should display “Password is Invalid” */

import java.util.Scanner;

public class p3 
{
    public static void main(String[] args) 
    {
        int num_count = 0, letter_count = 0, sp_char_count = 0, error1 = 0, length_check = 0;
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("The password must contain one capital letter, one digit and one special character from $, #, %");

        // Taking password as input from user
        System.out.println("Enter password :");
        String pw = scan.next();

        // Checking requirements of password
        if(pw.length() >= 8 && pw.length() <= 15)
        {
            length_check = 1;
            for(int i=0; i<pw.length(); i++)
            {
                // Definition : The charAt(int index) method returns the character at the specified index in a string. The index of the first character is 0, the second character is 1, and so on.
                ch = pw.charAt(i);

                // Numbers checking
                if(ch >= '0' && ch <= '9')
                {
                    num_count += 1;
                }

                // Capital & Small Alphabets checking
                if(ch >= 'A' && ch <= 'Z')
                {
                    letter_count++;
                }
                else if(ch >= 'a' && ch <= 'z')
                {
                    error1 = 1;
                }
                
                // Special Characters checking
                if(ch == '$' || ch == '#' || ch == '%')
                {
                    sp_char_count++;
                }
            }
        }
        else
        {
            System.out.println("Password should be of length 8 to 15");
        }

        // Error handling
        if(length_check == 1)
        {
            if(num_count == 0)
            {
                System.out.println("Password must contain numbers");
            }
            if(letter_count == 0 || error1 == 1)
            {
                System.out.println("Password must contain Capital Alphabets");
            }
            if(sp_char_count == 0)
            {
                System.out.println("Password must contain #, $ and % special characters only");
            }
        }
        
        // Condition for valid password
        if(num_count >= 1 && letter_count >= 1 && sp_char_count >= 1)
        {
            System.out.println("Password is valid");
        }
        else
        {
            System.out.println("Password is invalid");
        }
    }    
}
