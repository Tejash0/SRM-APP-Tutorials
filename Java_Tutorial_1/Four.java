import java.util.Scanner;
public class Four
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Enter current Temprature");
        int a = scn.nextInt();

        if(a > 30)
        {
            System.out.println("It's Hot!");
        }
        else if(a > 20 && a< 30)
        {
            System.out.println("It's Warm!");
        }
        else if(a > 10 && a< 20)
        {
            System.out.println("It's Cool!");
        }
        else
        {
            System.out.println("It's Cold!");
        }scn.close();
    }
}