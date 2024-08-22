import java.util.Scanner;
public class Five
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scn.nextInt();
        do
        {
            System.out.println("Enter a number");
            a = scn.nextInt();
        }while(a < 0);
        System.out.println("THE NUMBER WAS POSITIVE");
        scn.close();
    }
}
