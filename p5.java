// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Design a class named Triangle to represent a
Triangle. The class contains:

1) Three double data fields named a, b and c specifying three sides of the
   triangle. The default values are 1.
2) A no-arg constructor that creates a default triangle.
3) A constructor that creates a triangle with the specified values.
4) A method named getArea() that returns the area of this triangle.
5) A method named getPerimeter() that returns the perimeter. */

import java.util.Scanner;
import java.lang.Math;

class Triangle
{
    // private data fields
    private double a;
    private double b;
    private double c;

    // no-parameter Constructor with default values
    public Triangle()
    {
        a = 1;
        b = 1;
        c = 1;
    }
     
    // Parameterized Constructor
    public Triangle(double side1, double side2, double side3)
    {
        a = side1;
        b = side2;
        c = side3;
    }

    // Method to find Area
    public double getArea()
    {
        double s = (a + b + c)/2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    // Method to find Perimeter
    public double getPerimeter()
    {
        return (a + b + c);
    }
}

public class p5 
{
    public static void main(String[] args) 
    {
        // For Default no-argument Constructor
        Triangle t1 = new Triangle();
        
        // Perimeter for Triangle t1
        System.out.println("Perimeter of Triangle 1 is : " + t1.getPerimeter());

        // Area for default values of sides 1, 2 and 3 
        System.out.println("Area of Triangle 1 by Default no-parameter Constructor is :" + t1.getArea());

        // Scanning values for sides 1, 2 and 3
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for three sides of Triangle :");

        // Side 1
        double side1 = scan.nextDouble();

        // Side 2
        double side2 = scan.nextDouble();

        // Side 3
        double side3 = scan.nextDouble();

        // For Parameterized Constructor
        Triangle t2 = new Triangle(side1, side2, side3);
        
        // Perimeter for Triangle t2
        System.out.println("Perimeter of Triangle 2 is : " + t2.getPerimeter());

        // Area for custom input of sides 1, 2 and 3
        System.out.println("Area of Triangle by Parameterized Constructor is :" + t2.getArea());
    }
}
