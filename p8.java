// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/*Write a simple java application that defines a class Complex with real(int) and img(int) as data fields, no-argument constructor and parameterized constructor. The class should have overloaded methods to perform addition of two Complex numbers by passing objects as arguments. Demonstrate this keyword in a parameterized constructor. */

import java.util.Scanner;

class Complex
{
    int real;
    int img;

    // No-parameter Constructor
    Complex()
    {
        real = 0;
        img = 0;
    }

    // Parameterized Constructor
    Complex(int real, int img)
    {
        this.real = real;
        this.img = img;
    }

    // Method for adding two complex numbers
    void add(Complex c1, Complex c2)
    {
        real = c1.real + c2.real;
        img = c1.img + c2.img;
    }

    // Method for adding two complex numbers (Overloaded Method)
    Complex add(Complex c1)
    {
        Complex temp = new Complex();
        temp.real = c1.real + this.real;
        temp.img = c1.img + this.img;
        return temp;
    }

    // Method for displaying complex numbers
    void display()
    {
        System.out.println("The number is : " + this.real + " + " + this.img + "i");
    }
}


public class p8 
{
    public static void main(String[] args) 
    {
        int real1, img1, real2, img2;
        Scanner sc = new Scanner(System.in);
        Complex ans = new Complex();

        // Adding two numbers using No-argument constructor
        System.out.println("Addition of two numbers using No-argument constructor : ");
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        ans = c1.add(c2);
        ans.display();

        System.out.println("For Parameterized Constructor : ");

        // Input 1st number
        System.out.println("Enter Real part for number 1 : ");
        real1 = sc.nextInt();
        System.out.println("Enter imaginary part for number 1 : ");
        img1 = sc.nextInt();
        Complex c4 = new Complex(real1, img1);

        // Input 2nd number 
        System.out.println("Enter Real part for number 2 : ");
        real2 = sc.nextInt();
        System.out.println("Enter imaginary part for number 2 : ");
        img2 = sc.nextInt();
        Complex c5 = new Complex(real2, img2);

        // Display 1st number
        c4.display();
        // Display 2nd number
        c5.display();
    
        Complex c3 = new Complex();
        // Addition of two complex numbers 
        c3.add(c4, c5);
        c3.display();

        // Addition of two complex numbers 
        ans = c4.add(c5);
        ans.display();
    }
}