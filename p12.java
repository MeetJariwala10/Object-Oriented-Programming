// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a simple java application that creates a Shape class with two double data members. The class should have an area method to calculate the area of shape. Inherit two classes Rectangle and Triangle from Shape class. Demonstrate method overriding & super keyword. */

class Shape
{
    double d1;
    double d2;

    Shape(double d1, double d2)
    {
        this.d1 = d1;
        this.d2 = d2;
    }

    double area()
    {
        return d1 * d2;
    }
}
class Rectangle extends Shape
{
    Rectangle(double length, double width)
    {
        super(length, width); /* super keyword will call the super class constructor */
    }

    // Method Overriding
    double area()
    {
        return d1 * d2;
    }
}
class Triangle extends Shape
{
    Triangle(double base, double height)
    {
        super(base, height);
    }

    // Method Overriding
    double area()
    {
        return 0.5 * d1 * d2;
    }
}

public class p12 
{
    public static void main(String[] args) 
    {
        // For shape
        Shape s1 = new Shape(4, 3);
        System.out.println("Area of shape : " + s1.area());

        // For Rectangle
        Rectangle r1 = new Rectangle(5, 3);
        System.out.println("Area of rectangle : " + r1.area());
        
        // For Triangle
        Triangle t1 = new Triangle(5, 0.2);
        System.out.println("Area of triangle : " + t1.area());
    }    
}
