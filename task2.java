import java.io.*;
import java.util.*;
public class task2
{
    public static void main(String[] args) 
    {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects (out of 100):");
        int mark1 = scan.nextInt();
        int mark2 = scan.nextInt();
        int mark3 = scan.nextInt();
        int mark4 = scan.nextInt();
        int mark5 = scan.nextInt();
        
        int total = mark1 + mark2 + mark3 + mark4 + mark5;

        int avg_percentage = total / 5;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + avg_percentage + "%");

        // Correcting the grading logic
        if(avg_percentage == 100)
        {
            System.out.println("Grade: O");
        }
        else if (avg_percentage >= 90)
        {
            System.out.println("Grade: A+");
        }
        else if (avg_percentage >= 80)
        {
            System.out.println("Grade: A");
        }
        else if (avg_percentage >= 70)
        {
            System.out.println("Grade: B+");
        }
        else if (avg_percentage >= 60)
        {
            System.out.println("Grade: B");
        }
        else if (avg_percentage >= 50)
        {
            System.out.println("Grade: C");
        }
        else
        {
            System.out.println("Grade: Fail");
        }
    }
}