class Time
{
    private int hour;
    private int minute;
    
    Time()
    {
        hour = 0;
        minute = 0;
    }

    Time(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    Time add(Time t)
    {
        Time sum = new Time();
        sum.hour = this.hour + t.hour;
        sum.minute = this.minute + t.minute;

        if(sum.minute >= 60)
        {
            sum.hour += 1;
            sum.minute -= 60;
        }
        return sum;
    }

    void showTime()
    {
        System.out.println(hour + ":" + minute);
    }
}

public class practice_prog5 
{
    public static void main(String[] args) 
    {
        Time time1 = new Time(1, 5);
        Time time2 = new Time(1, 10);

        Time total = time1.add(time2);

        System.out.print("Total Time : ");
        total.showTime();
    }
}
