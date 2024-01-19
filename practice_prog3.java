// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a simple java program that uses Scanner utility. The program takes two integer values from the user and perform the subtraction of second number from the first number. Display the result on the screen. */

import java.util.Scanner;

class practice_prog3
{
	public static void main(String args[])
	{
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");		
		num1 = scan.nextInt();
		
		System.out.println("Enter number 2 : ");
		num2 = scan.nextInt();

		System.out.println("The subtraction of " + num1 + " from " + num2 + " is :  " + (num2 - num1));
	}
}
