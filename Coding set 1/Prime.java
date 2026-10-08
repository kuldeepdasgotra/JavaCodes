import java.util.Scanner;

public class Prime 
{
    public static void main(String[] args)
    {
        int a;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%2!=0)
        {
            for (int i=2;i*i<=a;i++)
            {
                if(a%i!=0)
                {
                    System.out.println("It is a prime number");
                }
            }
        }
        else
        
            if(a==2)
            {
                System.out.println("It is a prime number");
            }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
}
