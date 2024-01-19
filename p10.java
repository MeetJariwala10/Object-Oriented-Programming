// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Demonstrate the static data field and static method by creating an appropriate class.
Demonstrate this class in the main method by creating different objects., 
[hint: one static data field, one static setter method , one non-static getter method. create two objects, Call the static method using class and one object name. show the impact on value of static data field using second object.] */

class StaticDemo 
{
    static int num1 = 50;
    int num2 = 100;
    
    static void isStatic()
    {
        System.out.println("Static variable : " + num1);

        // We cannot access non static variable in static method
        // System.out.println("Non Static : " + num2);
    }

    void nonStatic()
    {
        System.out.println("Static variable : " + num1);
        System.out.println("Non Static variable : " + num2);
    }

    void display()
    {
       System.out.println("After changing num1 : " + num1);
    }
}

public class p10 
{
    public static void main(String[] args) 
    {
        System.out.println("Code Prepared by : Meet Jariwala (ET22BTCO046)");
        
        StaticDemo st = new StaticDemo();
        
        // Object is created for non-static method
        System.out.println("In non-static method : ");
        st.nonStatic();

        // Class name is provided for static method (No object is to be created)
        System.out.println("In static method :");
        StaticDemo.isStatic();
        // st.isStatic(); 
        
        // Impact on value of static data field using second object
	    StaticDemo obj1 = new StaticDemo();
        // StaticDemo.num1 = 152;
	    obj1.num1 = 550;
	    StaticDemo obj2 = new StaticDemo();
	    obj2.display();
    }
}

