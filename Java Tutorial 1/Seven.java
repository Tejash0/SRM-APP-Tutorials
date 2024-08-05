//Name:- Kumar Tejash
//Reg.no:- 2311003011446
import java.util.Scanner;
public class Seven
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Enter 1 for addition or 2 for subtraction");
        int a = scn.nextInt();

        if(a == 1)
        {
                System.out.println("Enter Two numbers");
                int b = scn.nextInt();
                int c = scn.nextInt();
                int sum = b + c;
                System.out.println("The Sum: " +sum);
        }
        else if(a == 2)
        {
            System.out.println("Enter Two numbers");
                int b = scn.nextInt();
                int c = scn.nextInt();
                int diff = b - c;
                System.out.println("The diffrnece: " +diff);
        }
        else 
        {
            System.out.println("Invalid Choice");
        }scn.close();
    }
}