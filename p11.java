// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a simple java application that creates a Player class. Inherit CricketPlayer
class from Player class. Inherit Batsman & Bowler classes from
CricketPlayer class. Assume suitable data and member methods. */

import java.util.Scanner;

class Player
{
    String country;
    String name;
    int age;
}
class CricketPlayer extends Player
{
    // Taking data of cricket players
    void getData()
    {
        Scanner sc = new Scanner(System.in);

        // Data members are inherited from Player class
        System.out.print("Enter Country Name : ");
        country = sc.nextLine();

        System.out.print("Enter Name : ");
        name = sc.nextLine();

        System.out.print("Enter Age : ");
        age = sc.nextInt();
    }
}
class Batsman extends CricketPlayer
{
    // Data members are inherited from Player and CricketPlayer class
    int runs;

    // Runs scored
    void getRuns()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter runs scored by player : ");
        runs = sc.nextInt();
    }
    // Printing Batsman Details
    void batsmanDetails()
    {
        System.out.println("Details of Batsman : ");
        System.out.println("Country : " + country);
        System.out.println("Player : Batsman");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Runs Scored : " + runs);
    }
}
class Bowler extends CricketPlayer
{
    // Data members are inherited from Player and CricketPlayer class
    int wickets;

    // Wickets taken
    void getWickets()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter wickets taken by player : ");
        wickets = sc.nextInt();
    }

    // Printing Bowler Details
    void bowlerDetails()
    {
        System.out.println("Details of Bowler : ");
        System.out.println("Country : " + country);
        System.out.println("Player : Bowler");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Wickets Taken : " + wickets);
    }
}

public class p11 
{
    public static void main(String[] args) 
    {
        System.out.println("Code Prepared by : Meet Jariwala (ET22BTCO46)");
        Scanner sc = new Scanner(System.in);

        System.out.println("1 -> Batsman\n2 -> Bowler");
        System.out.print("Enter key : ");
        int choice = sc.nextInt();

        switch(choice)
        {
            // For batsmen
            case 1:
            {
                Batsman bt1 = new Batsman();
                bt1.getData();
                bt1.getRuns();
                bt1.batsmanDetails();
                break;
            }
            // For Bowler
            case 2:
            {
                Bowler b1 = new Bowler();
                b1.getData();
                b1.getWickets();
                b1.bowlerDetails();
                break;
            }
            default:
            {
                System.out.println("Invalid Choice");
                break;
            }
        }
    }    
}
