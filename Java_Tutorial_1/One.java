import java.util.Scanner;
public class One
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Enter a Number");
        int a = scn.nextInt();

        if(a%2 == 0)
        {
            System.out.println("The Number is even");
        }
        else
        {
            System.out.println("The Number is odd");
        }scn.close();
    }
}