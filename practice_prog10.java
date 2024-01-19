public class practice_prog10 
{
    public static void main(String[] args) 
    {
        if(args.length == 0)
        {
            System.out.println("Provide command line argument");
        }    

        String str = args[0];
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev))
        {
            System.out.println(str + " is Palindrome");
        }
        else
        {
            System.out.println(str + " is not Palindrome");
        }

    }    
}
