//Name:- Kumar Tejash
//Reg.no:- 2311003011446
import java.util.Scanner;
public class Five 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Principal : ");
        int principal = scn.nextInt();
        System.out.println("Enter the rate : ");
        float rate = scn.nextFloat();
        System.out.println("Enter the time : ");
        int time = scn.nextInt();
        float SI;

        SI = (principal * rate * time)/100;
  
        System.out.println("The simple interest : " + SI);
        scn.close();
    }
    
}
