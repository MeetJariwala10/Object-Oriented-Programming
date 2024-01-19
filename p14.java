// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a simple java application that creates an interface Shape. The interface declares read() and show() methods and PI as constant data member. Create classes Rectangle and Circle that implement a Shape interface. Assume suitable data and member methods */

// Interface is completely abstract class
interface Shape
{
    final double PI = 3.14;
    void read(int d1, int d2); /* All methods are implicitly abstract */
    void show(); /* No body of method */
}
class Rectangle implements Shape
{
    int length;
    int width;

    public void read(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void show()
    {
        System.out.println("Area of Rectangle : " + (length * width));
    }
}
class Triangle implements Shape
{
    int base;
    int height;

    public void read(int base, int height)
    {
        this.base = base;
        this.height = height;
    }

    public void show()
    {
        System.out.println("Area of Triangle : " + (0.5 * base * height));
    }
}

public class p14 
{
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle();
        r1.read(5, 5);
        r1.show();

        Triangle t1 = new Triangle();
        t1.read(2, 5);
        t1.show();
    }    
}
