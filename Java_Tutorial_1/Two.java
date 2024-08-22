import java.util.Scanner;
public class Two
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Enter your Age");
        int age = scn.nextInt();

        if(age < 18)
        {
            System.out.println("You are not eligible to vote");
        }
        else
        {
            System.out.println("You are eligible to vote");
        }scn.close();
    }
}