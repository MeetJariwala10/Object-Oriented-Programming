// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a simple java application that creates a Player class. Inherit CricketPlayer
class from Player class. Inherit Batsman & Bowler classes from
CricketPlayer class. Assume suitable data and member methods. */

class Player
{
    String name;
    int age;

    // Parameterized constructor
    Player(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void playerInfo()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
class CricketPlayer extends Player
{
    int year;

    CricketPlayer(String name, int age, int year)
    {
        super(name, age);  /* It will refer to super class constructor */
        this.year = year;
    }

    void playerInfo()
    {
        super.playerInfo(); /* It will refer to super class method */
        System.out.println("Year : " + year);
    }
}
class Batsman extends CricketPlayer
{
    int runs;

    Batsman(String name, int age, int year, int runs)
    {
        super(name, age, year); /* It will refer to super class constructor */
        this.runs = runs;
    }

    void playerInfo()
    {
        super.playerInfo(); /* It will refer to super class method */
        System.out.println("Runs : " + runs);
    }
}
class Bowler extends CricketPlayer
{
    int wickets;
    
    Bowler(String name, int age, int year, int wickets)
    {
        super(name, age, year); /* It will refer to super class constructor */
        this.wickets = wickets;
    }

    void playerInfo()
    {
        super.playerInfo(); /* It will refer to super class method */
        System.out.println("Wickets : " + wickets);
    }
}

public class p11_2
{
    public static void main(String[] args) 
    {
        Batsman batsman1 = new Batsman("Virat Kohli", 30, 1997, 8000);
        Bowler bowler1 = new Bowler("Bumrah", 28, 1999, 500);

        System.out.println();

        System.out.println("Batsman Information : ");
        batsman1.playerInfo();

        System.out.println();
        
        System.out.println("Bowler Information : ");
        bowler1.playerInfo();
    }    
}
