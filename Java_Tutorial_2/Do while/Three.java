//Name:- Kumar Tejash
//Reg.no:- 2311003011446
import java.util.Scanner;

public class Three 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = scn.nextInt();
        int b = 1;

        do 
        {
            System.out.println(a+ " X " + b +" = "+a*b);
            b++;
        } while (b < 11);
        scn.close(); // Close the scanner
    }
}
