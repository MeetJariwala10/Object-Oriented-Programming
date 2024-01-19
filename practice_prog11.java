abstract class Shape
{
    double d1;
    double d2;

    abstract void area();
}

class Rectangle extends Shape
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    void area()
    {
        System.out.println("Area of rectangle: " + (length*breadth));
    }
}

class Triangle extends Shape
{
    double base;
    double height;

    Triangle(double base, double height)
    {
        this.base = base;
        this.height =height;
    }

    void area()
    {
        System.out.println("Area of Triangle: " + (base*height));
    }
}

public class practice_prog11 
{
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle(5, 10);
        r1.area();

        Triangle t1 = new Triangle(2, 5);
        t1.area();
    }    
}
