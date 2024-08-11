import java.util.Scanner;
class Two
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        String a = scn.nextLine();
        int b;
        b = Check(a);
        scn.close();
    }

    static int Check(String x)
    {
        int a = x.length();
        if(a >= 8)
        {
            if(x[0]>64 || x[0] < 91)
            {
                return 1;
            }
        }
        else
        return 0;
    }
}