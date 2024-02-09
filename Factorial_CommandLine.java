// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a program to find the factorial of a given number. Take the number through the command line argument. */

public class Factorial_CommandLine
{
    public static void main(String[] args) 
    {
        if (args.length == 0) 
        {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        // Definition : Integer class is a wrapper class for the primitive type int which contains several methods to effectively deal with an int value like converting it to a string representation, and vice-versa.
        // Definition : The method parseInt() belongs to the Integer class which is under java.lang package. It is used to parse the string value as a signed decimal value. It is used in Java for converting a string value to an integer by using the method parseInt().

        int number = Integer.parseInt(args[0]);
        int factorial = 1;

        for (int i = 1; i <= number; i++) 
        {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
