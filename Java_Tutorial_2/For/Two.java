//Name:- Kumar Tejash
//Reg.no:- 2311003011446
import java.util.Scanner;
public class Two 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scn.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(a +" X "+i+" = "+a*i);
        }
        scn.close();
    }
}
