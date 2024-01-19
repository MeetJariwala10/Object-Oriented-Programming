// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a simple java application that creates a Shape class with two double data members. The class should have one abstract method area to calculate the area of shape. Inherit two classes Rectangle and Triangle from Shape class. Demonstrate runtime polymorphism. */

// Rule: If there is an abstract method in a class, that class must be abstract.
abstract class Shape
{
    double d1;
    double d2;

    Shape(double d1, double d2)
    {
        this.d1 = d1;
        this.d2 = d2;
    }

    // Abstract method
    abstract void area();
}

/* Rule: If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract. */
class Rectangle extends Shape
{
    Rectangle(double length, double width)
    {
        super(length, width);
    }
    
    // Implementation of method
    void area() /* Method overriding */
    {
        System.out.println("Area of Rectangle : " + (d1 * d2));
    }
}

class Triangle extends Shape
{
    Triangle(double base, double height)
    {
        super(base, height);
    }

    void area() /* Method overriding */
    {
        System.out.println("Area of Triangle : " + (0.5 * d1 * d2));
    }
}

public class p13 
{
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle(5, 3);
        r1.area();

        Triangle t1 = new Triangle(2, 46);
        t1.area();
    }    
}
