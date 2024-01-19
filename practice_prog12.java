interface FindArea
{
    final double PI = 3.14;
    void area();
}

class Circle implements FindArea
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    public void area()
    {
        System.out.println("Area of rectangle: " + (PI * radius * radius));
    }
}

class Ellipse implements FindArea
{
    double major_axis;
    double minor_axis;

    Ellipse(double major_axis, double minor_axis)
    {
        this.major_axis = major_axis;
        this.minor_axis = minor_axis;
    }

    public void area()
    {
        System.out.println("Area of Triangle: " + (PI * major_axis * minor_axis));
    }
}

public class practice_prog12 
{
    public static void main(String[] args) 
    {
        Circle c1 = new Circle(10);
        c1.area();

        Ellipse e1 = new Ellipse(5, 2);
        e1.area();
    }    
}
