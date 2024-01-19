// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Design a class named StopWatch. The class contains:
1) Private data fields startTime and endTime with getter methods.
2) A no-arg constructor that initializes startTime with the current time.
3) A method named start() that resets the startTime to the current time.
4) A method named stop() that sets the endTime to the current time.
5) A method named getElapsedTime() that returns the elapsed time for the stopwatch in
   milliseconds. */

   
import java.util.Date;
import java.util.Random;

class StopWatch
{
    // private data fields
    private long startTime;
    private long endTime;

    // no-argument constructor
    public StopWatch()
    {
        startTime = new Date().getTime();
    }

    // getter method for StartTime
    public long getStartTime()
    {
        return startTime;
    }

    // getter method for endTime
    public long getEndTime()
    {
        return endTime;
    }

    // start() method to reset the startTime with the current time
    public void start()
    {
        startTime = new Date().getTime();
    }

    // stop() method to set the endTime the current time
    public void stop()
    {
        endTime = new Date().getTime();
    }

    // getElapsedTime() method to show the time elapsed
    public long getElapsedTime()
    {
        return (endTime - startTime);
    }
}

public class p6
{
    public static void main(String[] args) 
    {
        StopWatch stopwatch = new StopWatch();

        // Generating random numbers
        Random random = new Random(10);

        int[] array = new int[50];
        
        for(int i=0; i<25; i++)
        {
            array[i] = random.nextInt(100);
        }

        // starting stopwatch
        stopwatch.start();
        
        // performing some code operations for time consumption
        bubbleSort(array);

        // stoping stopwatch
        stopwatch.stop();

        // ElapsedTime in milliseconds
        System.out.println("Time taken is : " + stopwatch.getElapsedTime() + " milliseconds");
    }

    public static void bubbleSort(int[] array)
    {
        int temp; 
        for(int i=0; i<25; i++)
        {
            for(int j=0; j<25-i-1; j++)
            {
                if(array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Arary after sorting is : ");
        for(int i=0; i<25; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
