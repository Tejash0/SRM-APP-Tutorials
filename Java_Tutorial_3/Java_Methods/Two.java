import java.util.Scanner;
class Two
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        String a = scn.nextLine();
        Check(a);
    }

    static void Check(String x)
    {
        System.out.println(x);
    }
}