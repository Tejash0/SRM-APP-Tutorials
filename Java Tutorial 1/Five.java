//Name:- Kumar Tejash
//Reg.no:- 2311003011446
import java.util.Scanner;
public class Five
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Enter a number");
        int a = scn.nextInt();

        if(a > 0)
        {
            System.out.println("The number is positive");
        }
        else if(a < 0)
        {
            System.out.println("The number is negative ");
        }
        else 
        {
            System.out.println("The Number is Zero");
        }
        scn.close();
    }
}