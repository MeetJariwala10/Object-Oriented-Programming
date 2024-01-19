class A extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 20; i++)
        {
            if(i % 3 == 0)
            {
                System.out.println("Thread - 1: " + i);

                try
                {
                    Thread.sleep(500);
                }
                catch(Exception e)
                {

                }
            }
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 20; i++)
        {
            if(i % 4 == 0)
            {
                System.out.println("Thread - 2: " + i);

                try
                {
                    Thread.sleep(500);
                }
                catch(Exception e)
                {
                    
                }
            }
        }
    }
}


public class practice_prog14 
{
    public static void main(String[] args) 
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }    
}
