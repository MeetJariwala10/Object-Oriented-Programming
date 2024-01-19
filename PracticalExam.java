interface Distance
{
    void add(int mt, int cm);
    void subtract(int mt, int cm);
}

class Dist1 implements Distance
{
    int mt;
    int cm;

    Dist1()
    {
        this.mt = 0;
        this.cm = 0;
    }

    Dist1(int mt, int cm)
    {
        this.mt = mt;
        this.cm = cm;
    }

    public void add(int mt1, int cm1)
    {
        this.mt += mt1;
        this.cm += cm1;

        while(this.cm >= 100)
        {
            this.cm -= 100;
            this.mt += 1;
        }
    }

     public void add(int mt1, int cm1, int mt2, int cm2)
    {
        this.mt += mt1;
        this.cm += cm1;

        while(this.cm >= 100)
        {
            this.cm -= 100;
            this.mt += 1;
        }
    }

    public void subtract(int mt1, int cm1)
    {
        if(this.mt > mt1 || (this.mt == mt1 && this.cm > cm1 ))
        {
            System.out.println("Invalid");
        }
        else
        {
            this.mt -= mt1;
            this.cm -= cm1;
        }
    }

    void display()
    {
        System.out.println("mt: " + mt);
        System.out.println("cm: " + cm);
    }
}


public class PracticalExam 
{
    public static void main(String[] args)
    {
        Dist1 d1 = new Dist1(5, 100);
        Dist1 d2 = new Dist1(1, 200);

        // Dist1 d3 = new Dist1();
        d2.add(d1.mt, d1.cm);
        d2.display();

        d1.subtract(d2.mt, d2.cm);
        d1.display();
    }    
}
