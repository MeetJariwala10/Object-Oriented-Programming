import java.util.Scanner;

class Employee
{
    int id;
    String name;
    int experience;
    int age;

    Employee(int id, String name, int experience, int age)
    {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.age = age;
    }

    void getDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name : ");
        name = sc.nextLine();
        
        System.out.println("Age : ");
        age = sc.nextInt();
    }
}

public class practice_prog9 
{
    public static void main(String[] args) 
    {

    }    
}
