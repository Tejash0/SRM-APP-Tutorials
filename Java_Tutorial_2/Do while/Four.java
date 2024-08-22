import java.util.Scanner;
public class Four
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int a = scn.nextInt();
        int fact = 1,i = 1;
        do
        {
            fact *= i;
            i++;
        }while(i <= a);
        System.out.println(fact);
        scn.close();
    }
}
