// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a simple java application that defines a class Student with roll_no(int), name(String), address(String) & branch(String) as data fields. The class should have getData() & showData() methods. The program should create an array of Student objects, get the details and display it. Create branchDisplay(student[] s) static method to display all objects having computer branch. */

import java.util.Scanner;

class Student
{
    int roll_no;
    String name;
    String address;
    String branch;

    Scanner sc = new Scanner(System.in);
    
    // getData() method to take details of students
    void getData()
    {
        System.out.println("Enter Details : ");

        System.out.print("Enter Name : ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number : ");
        roll_no = sc.nextInt();

        System.out.print("Enter Branch : ");
        branch = sc.next();

        System.out.print("Enter Address : ");
        sc.nextLine();
        address = sc.nextLine();
    }

    // showData() method to show the details of students
    void showData()
    {
        System.out.println("Name : " + name);   
        System.out.println("Roll Number : " + roll_no);
        System.out.println("Address : " + address);
        System.out.println("Branch : " + branch);
    }

    // branchDisplay() method which shows the details of students of "Computer" branch only
    public static void branchDisplay(Student[] s, int size)
    {
        int flag = 0;
        for(int i=0; i<size; i++)
        {
            // Comparison of : if branch = "Computer"
            // If we use s[i].branch.equals("Computer") -> This will be Case Sensitive
            if(s[i].branch.equalsIgnoreCase("Computer"))
            {
                flag = 1;
                System.out.println("Name : " + s[i].name );
                System.out.println("Roll Number : " + s[i].roll_no);
                System.out.println("Address : " + s[i].address);
                System.out.println("Branch : " + s[i].branch);
            }
        }
        if(flag == 0)
        {
            System.out.println("No students is involved in Computer Branch");
        }
    }
}

public class p9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Code Prepared by : Meet Jariwala (ET22BTCO046)");
        System.out.println("Enter number of students : ");
        int size = sc.nextInt();

        // Array of Student object
        Student[] s = new Student[size];

        // Allocating memory for the Student object
        for(int i = 0; i < size; i++)
        {
            s[i] = new Student(); /* MAIN STEP */
        }

        // Getting data of students
        for(int i = 0; i < size; i++)
        {
            s[i].getData();
        }

        // Showing data of students
        System.out.println("Details of Student : ");
        for(int i = 0; i < size; i++)
        {
            s[i].showData();
        }
        
        // Details of Computer Branch Students only
        System.out.println("Data of students enrolled in Computer Branch :");
        Student.branchDisplay(s, size);
    }
}
