//Name:- Kumar Tejash
//Reg.no:- 2311003011446
import java.util.Scanner;

public class Four
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a odd number");
        int n = scn.nextInt();
        for(int i = 1; i <= n; i+=2)
        {
            System.out.println(i);
        }
        scn.close();
    }    
}
