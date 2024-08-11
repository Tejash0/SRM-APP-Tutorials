//Name:- Kumar Tejash
//Reg.no:- 2311003011446
import java.util.Scanner;

public class Two 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the Exponent : ");
        int a = scn.nextInt();
        int i = 1;

        do {
            System.out.println(Math.pow(2,i));
            i++;
            a--;
        } while (a != 0);
        scn.close();
    }
}
