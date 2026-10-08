import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        int a,first=0,second=1;
        System.out.println("Enter number of terms of fibonacci series:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("fibonacci series is as follows:");
        for (int i=0;i<a;i++)
        {
            int next=first+second;
            System.out.println(first);
            first=second;
            second=next;
        }
    }
}