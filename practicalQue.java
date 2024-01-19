abstract class TimeConversion
{
    abstract void convert();
}

class Time12 extends TimeConversion
{
    int h;
    int m;
    int s;
    String ap;

    Time12(int h, int m, int s, String ap)
    {
        this.h = h;
        this.m = m;
        this.s = s;
        this.ap = ap;
    }

    void convert()
    {
        if(this.ap.equals("am"))
        {
            if(this.h >= 12 && this.m >= 0 && this.s >= 0)
            {
                System.out.println("Input will be pm format");
            }
            else
            {
                display();
            }
        }
        else if(this.ap.equals("pm"))
        {
            this.h += 12;

            if(this.h == 24 && this.m > 0 && this.s > 0)
            {
                System.out.println("Invalid pm format");
            }
            else
            {
                display();
            }
        }
    }

    void display()
    {
        System.out.println("24 Hours Format:  H:" + h + " M: " + m + " S: " + s);
    }

}

class Time24 extends TimeConversion
{
    int h;
    int m;
    int s;
    String ap;

    Time24(int h, int m, int s)
    {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    void convert()
    {
        if(this.h == 24 && this.m >= 0 && this.s >= 0)
        {
            this.h = 0;
            this.ap = "am";

            display();
            return;
        }
        if(this.h >= 12 && this.m >= 0 && this.s >= 0)
        {
            this.h -= 12;
            this.ap = "pm";

            display();
        }
        else if(this.h < 12)
        {
            this.ap = "am";
            display();
        }
    }

    void display()
    {
        System.out.println("12 Hours Format:  H:" + h + " M: " + m + " S: " + s + " " + ap);
    }

}

public class practicalQue 
{
    public static void main(String[] args)
    {
        Time12 t = new Time12(11, 0, 0, "am");
        t.convert();

        System.out.println();

        Time12 t2 = new Time12(12, 0, 0, "pm");
        t2.convert();

        Time24 t3 = new Time24(24, 12, 56);
        t3.convert();

        Time24 t4 = new Time24(15, 2, 5);
        t4.convert();
    }
}
