class FIFAWC
{
    double height;
    double weigth;

    FIFAWC(double height, double weigth)
    {
        this.height = height;
        this.weigth = weigth;
    }

    void BMI()
    {
        System.out.println("BMI: " + (weigth / (height * height)));
    }
}

class Argentina extends FIFAWC
{
    Argentina(double height, double weigth)
    {
        super(height, weigth);
    }

    void BMI()
    {
        super.BMI();
    }
}

class France extends FIFAWC
{
    France(double height, double weigth)
    {
        super(height, weigth);
    }

    void BMI()
    {
        super.BMI();
    }
}


public class practice_prog13 
{
    public static void main(String[] args) 
    {
        Argentina a1 = new Argentina(5, 50);
        a1.BMI();

        France f1 = new France(6, 50);
        f1.BMI();
    }    
}
