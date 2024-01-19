// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Implement
a java application to show the Powers of the numbers like n1, n2, n3,
n4 where two threads T0 and T 1 belongs to object 1 and threads T2 and T3
belong to object 2. Handle the interferenc  e of the threads using static
synchronization. */

class Power
{
    /* Synchronized method to calculate and print powers of a given number. */
    synchronized static void printPower(int num)
    {
        int temp = 1;
        for(int i = 1; i <= 5; i++)
        {
            temp = num * temp;
            System.out.println(Thread.currentThread().getName() + ":- " + num + "^"+ i + " value: " + temp);
            
            try
            {
                // Producing a delay of 500 milliseconds
                Thread.sleep(500);
            }
            catch(Exception e)
            {

            }
        }
    }
}

// Class Thread1 extends Thread class
class Thread1 extends Thread
{
    Power p;

    // Constructor to initialize the Thread1 object with a Power object
    Thread1(Power p)
    {
        this.p = p;
    }

    // Run method to execute the thread's logic
    public void run()
    {
        Power.printPower(2);
    }
}

class Thread2 extends Thread
{
    Power p;

    Thread2(Power p)
    {
        this.p = p;
    }

    public void run()
    {
        Power.printPower(5);
    }
}

class Thread3 extends Thread
{
    Power p;

    Thread3(Power p)
    {
        this.p = p;
    }

    public void run()
    {
        Power.printPower(8);
    }
}

class Thread4 extends Thread
{
    Power p;

    Thread4(Power p)
    {
        this.p = p;
    }

    public void run()
    {
        Power.printPower(10);
    }
}

public class p19 
{
    /* Main class to demonstrate the Power class and thread synchronization */
    public static void main(String[] args) 
    {
        System.out.println("Code prepared by Meet Jariwala (ET22BTCO046)");

        // Creating two objects of Power class
        Power obj1 = new Power();
        Power obj2 = new Power();

        // Creating objects of different thread class
        Thread1 t1 = new Thread1(obj1);
        Thread2 t2 = new Thread2(obj1);

        Thread3 t3 = new Thread3(obj2);
        Thread4 t4 = new Thread4(obj2);

        // Starting the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }    
}
