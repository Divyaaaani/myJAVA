import java.lang.*;
import java.util.*;
class Displaydigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        int rem;
        int count=0;
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            count++;
            System.out.println(rem);
        }
        System.out.println("count the no of digits: "+ count);
    }
}