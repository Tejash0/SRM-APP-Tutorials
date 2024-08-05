import java.util.Scanner;
class One
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = scn.nextInt();
        int b = scn.nextInt();
        sum(a,b);
    }

    static void sum(int x,int y)
    {
        System.out.println("The sum: "+(x+y));
    }
}