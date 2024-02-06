// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a program which takes two numbers and an operator from the user and performs mathematical operation on entered two numbers. */

import java.util.Scanner;

public class p1
{
    public static void main(String args[]) 
    {
        int num1, num2;
        char input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        num1 = scan.nextInt();
        System.out.println("Enter 2nd number : ");
        num2 = scan.nextInt();
        System.out.println("Operations :");
        System.out.println("+ -> Addition \n - -> Subtraction \n * -> Multiplication \n / -> Division");
        System.out.println("Enter operator :");

        input = scan.next().charAt(0);
        switch(input)
        {
            case '+' :
            System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
            break;

            case '-' :
            System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
            break;

            case '*' :
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
            break;

            case '/' :
            System.out.println("Division of " + num1 + " and " + num2 + " is " + ((float)num1 / num2));
            break;

            default:
            System.out.println("Invalid operator !");
        }
        scan.close();
    }
}
