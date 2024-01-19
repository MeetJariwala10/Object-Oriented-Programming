// Name : Meet P Jariwala
// Enrollment number : ET22BTCO046

/* Write a program that sorts the integer numbers taken from the user as an input. */

import java.util.Arrays;
import java.util.Scanner;

public class p2 
{
    public static void main(String args[]) 
    {
        int size, i, j, temp;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        size = scan.nextInt();

        // Declaring array of integer type --> int[] arr;
        // Allocaring memory for given size --> arr = new int[size];
        int[] arr = new int[size];

        // Filling elements in array
        System.out.println("Enter numbers in array : ");
        for(i=0; i<size; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println("The array before sorting is : ");
        for(i=0; i<size; i++)
        {
            System.out.print(arr[i] + "\t");
        }

        /* Using sort method */
        Arrays.sort(arr);


        // Sorting array using Bubble sort
        // for(i=0; i<size - 1; i++)
        // {
        //     for(j=0; j<size-i-1; j++)
        //     {
        //         if(arr[j]>arr[j+1])
        //         {
        //             temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

        // Printing arary after sorting
        System.out.println("\nThe array after sorting is : ");
        for(i=0; i<size; i++)
        {
            System.out.print(arr[i] + "\t");
        }
    }
}
