public class practice_prog15
{
    public static void main(String[] args) 
    {
        String str = "Hello";
        String str1 = "Hello";
        str.concat("world");

        boolean b1 = str == str1;
        boolean b2 = str.equals(str1);

        System.out.println(b1 + " " + b2);

        /****************************************/
        int[] array = {4, 8, 16};

        int i = 1;
        array[++i] = --i + ++i;
        System.out.println(array[0] + array[1] + array[2]);
    }
}

