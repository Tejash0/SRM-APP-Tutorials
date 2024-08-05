//Name:- Kumar Tejash
//Reg.no:- 2311003011446
import java.util.Scanner;
public class Five 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = scn.nextInt();
        int i = 1;

        while (i <= a) {
            System.out.println(i);
            i++;
        }
        scn.close();
    }    
}
