class Shape
{
    double d1 = 5;
    double d2 = 10;

    double area()
    {
        System.out.println("Area of Shape");
        return d1;
    }
}
class Rectangle extends Shape
{
    double area()
    {
        return (d1 * d2);
    }
}

class Triangle extends Shape
{
    double area()
    {
        return (0.5 * d1 * d2);
    }
}
public class practice_prog6 
{
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.area());

        Triangle t1 = new Triangle();
        System.out.println(t1.area());
    }    
}
