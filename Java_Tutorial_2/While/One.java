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
        System.out.println("The Multiplication table for " + a + " : ");
        int i = 1;

        while (i != 11) {
            System.out.println(a + " * " + i + " = " + a*i);
            i++;
        }
        scn.close();
    }    
}
