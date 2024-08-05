//Name:- Kumar Tejash
//Reg.no:- 2311003011446
import java.util.Scanner;
public class Six
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Enter your Marks");
        int a = scn.nextInt();

        switch(a/10)
        {
            case 10:
            System.out.println("Your Grade is A(Excellent)");
            break;
            case 9:
            System.out.println("Your Grade is A(Excellent)");
            break;
            case 8:
            System.out.println("Your Grade is B(Very Good)");
            break;
            case 7:
            System.out.println("Your Grade is C(Good)");
            break;
            case 6:
            System.out.println("Your Grade is D(Satisfactory)");
            break;
            default:
            if(a >= 0 && a < 60)
            {
                System.out.println("Your Grade is F(Fail)");
            }
            else
            {
                System.out.println("Invalid Score");
            }
        }scn.close();
    }
}