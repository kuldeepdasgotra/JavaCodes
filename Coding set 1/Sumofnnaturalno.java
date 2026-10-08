import java.util.Scanner;
public class Sumofnnaturalno 
{
        public static void main(String[] args)
    {
        int a;
        int b=0;
        System.out.println("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("The Sum of natural numbers from 1 to the entered number is:");
        for(int i=1;i<=a;i++)
        {
            b+=i;
        }
        System.out.println(b);
    }
}
