/* Create a class Distance with cm, mtr and km data members, add the following member functions:
·      One constructor to initialize this data to zero.

·       Another constructor to initialize this data to fixed values.

·       Member function add_dist( ) to add two Distance objects to a third Distance object e.g. d3.add_dist(d1,d2). 

·       Make new function to return a Distance object, so that the function works as follows: d3=d1.add_dist(d2).

·       Create a compare_dist() to compare 2 distance object and return the object with max value. */


class Distance
{
    float cm;
    float mtr;
    float km;

    Distance()
    {
        cm = 0;
        mtr = 0;
        km = 0;
    }

    Distance(float cm, float mtr, float km)
    {
        this.cm = cm;
        this.mtr = mtr;
        this.km = km;
    }

    void add_dist(Distance d1, Distance d2)
    {
        this.cm = d1.cm + d2.cm;
        this.mtr = d1.mtr + d2.mtr;
        this.km = d1.km + d2.km;

        if(this.cm >= 100)
        {
            this.mtr += 1;
            this.cm -= 100;
        }
        if(this.mtr >= 1000)
        {
            this.km += 1;
            this.mtr -= 1000;
        }
    }

    Distance add_dist(Distance d1)
    {
        Distance sum = new Distance();
        sum.cm = this.cm + d1.cm;
        sum.mtr = this.mtr + d1.mtr;
        sum.km = this.km + d1.km;

        if(sum.cm >= 100)
        {
            sum.mtr += 1;
            sum.cm -= 100;
        }
        if(sum.mtr >= 1000)
        {
            sum.km += 1;
            sum.mtr -= 1000;
        }
        return sum;
    }

    Distance compare_Distance(Distance d1, Distance d2)
    {
        if(d1.km > d2.km || (d1.km == d2.km && d1.mtr > d2.mtr) || (d1.km == d2.km && d1.mtr == d2.mtr && d1.cm > d2.cm))
        {
            return d1;
        }
        else
        {
            return d2;
        }
    }
}


public class practice_prog8 
{
    public static void main(String[] args) 
    {
        Distance d1 = new Distance(90, 50, 1);
        Distance d2 = new Distance(10, 10, 1);
        Distance sum1 = new Distance();
        Distance sum2 = new Distance();

        sum1.add_dist(d1, d2);
        System.out.println(sum1.cm + " " + sum1.mtr + " " + sum1.km);
        sum2 = d1.add_dist(d2);
        System.out.println(sum2.cm + " " + sum2.mtr + " " + sum2.km);

        Distance max = new Distance();
        Distance max1 = new Distance();
        max1 = max.compare_Distance(d1, d2);
        System.out.println(max1.cm + " " + max1.mtr + " " + max1.km);
    }    
}
