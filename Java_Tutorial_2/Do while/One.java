//Name:- Kumar Tejash
//Reg.no:- 2311003011446
import java.util.Scanner;

public class One
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = scn.nextInt();
        int sum = 0,i = 0;

        do 
        {
            sum += i;
            i += 2;
        } while (i < a);

        System.out.println("The sum : " + sum);
        scn.close();
    }
}
