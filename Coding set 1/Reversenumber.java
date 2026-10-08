import java.util.Scanner;
public class Reversenumber 
{
    public static void main (String[] args)
{
    int a,rev=0;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Number with the digits reversed is:");
        int remainder=a%10;
        while(a!=0)
        {
            rev=rev*10+remainder;
            a=a/10;
        }
        System.out.println(rev);
        
}
}
