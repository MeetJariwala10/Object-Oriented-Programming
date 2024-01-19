class Rectangle
{
    float l = 1;
    float w = 1;

    Rectangle()
    {
        l = 0;
        w = 0;
    }

    Rectangle(float length, float width)
    {
        l = length;
        w = width;
    }

    float getArea()
    {
       return (l * w); 
    }

    float getPerimeter()
    {
        return (2*(l+w));
    }
}

public class practice_prog4
{
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.getArea());
        Rectangle r2 = new Rectangle(2, 4);
        System.out.println("Area : " + r2.getArea() + " Perimeter : " + r2.getPerimeter());
    }
}