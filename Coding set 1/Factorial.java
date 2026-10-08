import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args)
    {
        int a,fact=1;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("The factorial of given number is:");
        for(int i=1;i<=a;i++)
        {
            fact*=i;
        }
        System.out.println(fact);
    }
}
