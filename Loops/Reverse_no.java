import java.util.*;
import java.lang.*;
class Reverse_no
{
    public static void main(String args[])
    {
        System.out.println("enter the no: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+ rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}