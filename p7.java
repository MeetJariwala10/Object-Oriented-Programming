// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Create a class called Time containing followings:
1) Two private data fields Hour and Minute.
2) No-argument constructor and parameterized constructor.
3) A method getTime() that asks the user to enter the values of both fields.
4) A method ahead() which displays which object is ahead from other.
5) A method add() that performs addition of two objects and returns a third object.
6) A method showTime() to display time object. */

import java.util.Scanner;

class Time
{
    // Two private data fields Hour and Minute
    private int hour;
    private int minute;
    
    // No-argument constructor
    public Time()
    {
        hour = 0;
        minute = 0;
    }

    // Parameterized constructor
    public Time(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    // A method getTime() that asks the user to enter the values of both fields
    public void getTime()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Hours : ");
        hour = scan.nextInt();
        System.out.print("Enter Minutes : ");
        minute = scan.nextInt();
    }

    // A method ahead() which displays which object is ahead from other
    public void ahead(Time t)
    {
        if(this.hour > t.hour)
        {
            System.out.println("Time t1 is ahead of t2");
        }
        else if(this.hour == t.hour && this.minute > t.minute)
        {
            System.out.println("Time t1 is ahead of t2");
        }
        else
        {
            System.out.println("Time t2 is ahead of t1");
        }
    }

    // A method add() that performs addition of two objects and returns a third object.
    public Time add(Time t)
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

    // A method showTime() to display time object
    public void showTime()
    {
        System.out.println(hour + ":" + minute);
    }
}

public class p7 
{
    public static void main(String[] args) 
    {
        // 1 --> For No-argument constructor

        Time time1 = new Time();
        System.out.println("For time 1 -> ");
        time1.getTime();
        
        Time time2 = new Time();
        System.out.println("For time 2 -> ");
        time2.getTime();

        System.out.print("Time 1 -> ");
        time1.showTime();

        System.out.print("Time 2 -> ");
        time2.showTime();

        // checking if time1 > time2 or not 
        time1.ahead(time2);

        Time total = new Time();
        total = time1.add(time2);
        System.out.print("Total Time of time1 & time2 -> ");
        total.showTime();

        // 2 --> For Parameterized constructor

        Time time3 = new Time(1, 5);
        System.out.print("Time 3 -> ");
        time3.showTime();

        Time time4 = new Time(1, 10);
        System.out.print("Time 4 -> ");
        time4.showTime();

        // checking if time3 > time4 or not 
        time3.ahead(time4);

        Time total2 = new Time();
        total2 = time3.add(time4);
        System.out.print("Total Time of time3 & time4 -> ");
        total2.showTime();
    }
}
