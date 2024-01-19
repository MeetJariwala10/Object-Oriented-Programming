// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a simple java application that declares Employee class. The program should generate
and handle custom exceptions such as
a. InvalidEmailAddressException if the address does not contain . and @
b. InvalidTelephoneNumberException if total no of digits > 10. */

import java.util.Scanner;

class InvalidEmailAddressException extends Exception
{
    InvalidEmailAddressException(String str)
    {
        super(str);
    }
}
class InvalidTelephoneNumberException extends Exception
{
    InvalidTelephoneNumberException(String str)
    {
        super(str);
    }
}
class Employee
{
    String email;
    String num;

    void details()
    {
        // Try block with resources
        // This will auto close the scanner class object
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("\n Enter email address : ");
            email = sc.nextLine();

            // If email not contains both (.) and (@)
            if(!(email.contains(".") && email.contains("@")))
            {
                throw new InvalidEmailAddressException("\n Invalid email id \n");
            }
            else
            {
                System.out.println("\n Email id is valid");
            }

            System.out.print("\n Enter Telephone number : ");
            num = sc.next();

            // If number is beyond 10 digits or smaller than 10 digits
            if(num.length() > 10 || num.length() != 10)
            {
                throw new InvalidTelephoneNumberException("\n Too long number");
            }
            else
            {
                System.out.print("\n Telephone Number is Valid \n");
            }
        }
        catch(InvalidEmailAddressException ex1)
        {
            System.out.println("\n Enter email address containing (.) and (@)" + ex1);
        }
        catch(InvalidTelephoneNumberException ex2)
        {
            System.out.println("\n Enter telephone numbers upto 10 digits");
        }
    }
}
public class p17 
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.details();
    }    
}
