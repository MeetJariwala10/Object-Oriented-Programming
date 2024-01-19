// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a simple java application that creates two threads: One thread creates even numbers and another thread creates odd numbers. */

// Class Even implements Runnable Interface
class Even implements Runnable
{
    /* Class which implements Runnable interface should override the run() method*/
    /* This run() method contains the logic of the thread  */
    @Override
    public void run()
    {
        for(int i = 0; i <= 20; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("Even Thread - " + i);
            }
        }
    }
}

// Class Odd implements Runnable Interface
class Odd implements Runnable
{
    @Override
    public void run()
    {
        for(int i = 0; i <= 20; i++)
        {
            if(i % 2 == 1)
            {
                System.out.println("Odd Thread - " + i);
            }
        }
    }
}

public class p18 
{
    public static void main(String[] args)
    {
        System.out.println("Code prepared by Meet Jariwala (ET22BTCO046)");

        Runnable r1 = new Odd();
        /* Passing object of Runnable class to Thread class Constructor */
        Thread t1 = new Thread(r1);
        
        Runnable r2 = new Even();
        Thread t2 = new Thread(r2);
        
        /* start() method of Thread class will invoke the run() method */
        t1.start();
        t2.start();
    }    
}
