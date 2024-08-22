import java.util.Scanner;
public class Eight
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Enter a Year");
        int a = scn.nextInt();

        if(a%4 == 0)
        {
            if(a%100 != 0)
            {
                System.out.println("It's a Leap Year");
            }
            else if(a%100 == 0 && a%400 ==0)
            {
                System.out.println("It's a Leap Year");
            }    
        }
        else 
        {
            System.out.println("It's Not a Leap Year");
        }
        scn.close();
    }
}