import java.util.Scanner;
public class Three
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Press 1 for juice or 2 for Soda");
        int a = scn.nextInt();

        if(a == 1)
        {
            System.out.println("Dispensing Juice");
        }
        else if(a == 2)
        {
            System.out.println("Dispensing Soda");
        }
        else
        {
            System.out.println("Invalid Choice");
        }scn.close();
    }
}