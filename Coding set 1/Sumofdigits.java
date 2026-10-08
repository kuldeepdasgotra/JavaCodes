import java.util.Scanner;

public class Sumofdigits 
{
    public static void main(String[] args)
    {
        int a,sum=0;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int num=a%10;
        while(a!=0)
        {
            sum+=num;
            a/=10;
        }
        System.out.println("Sum of digits:"+sum);
    }
}
