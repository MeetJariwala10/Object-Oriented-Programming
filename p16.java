// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a simple java application that reads marks of five subjects through command line
arguments and displays the average. The application should generate an exception if marks
are not in integer format and out of 0-100. */

// Extending Exception class
class InvalidMarksEnterException extends Exception
{
    InvalidMarksEnterException()
    {

    }
}

public class p16 extends Exception
{
    public static void main(String[] args) 
    {
        int marks, sum = 0;
        
        try
        {
            if(args.length < 5 || args.length > 5)
            {
                System.out.println("Enter marks only for 5 students");
                System.exit(0);
            }
            for(int i = 0; i < 5; i++)
            {
                marks = Integer.parseInt(args[i]);

                if(marks > 100 || marks < 0)
                {
                    throw new InvalidMarksEnterException();
                }
                sum += marks;
            }
            System.out.println("Average marks : " + (float)sum / args.length);
        }
        catch(ArrayIndexOutOfBoundsException ex1)
        {
            System.out.println("Enter marks through command line");
        }
        catch(NumberFormatException ex2)
        {
            System.out.println("Marks should be in integer format");
        }
        catch(InvalidMarksEnterException ex3)
        {
            System.out.println("Marks should be in range of 0-100");
        }
    }   
}