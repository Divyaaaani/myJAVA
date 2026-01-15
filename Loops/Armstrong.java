import java.util.*;
import java.lang.*;
class Armstrong  // sum of cube of each no. = digit
{
    public static void main(String agr[])
    {
        Scanner sc= new Scanner(System.in);
    System.out.println("enter the no: ");
    int n=sc.nextInt();
    int sum=0,rem;
    int m=n;  /// strore no before hand to compare after
    while(n>0)
    {
        rem=n%10;  // gives last digit
        n=n/10;    // removing last digit
        sum= sum+rem*rem*rem;
    }
    if (sum==m)
    System.out.println("ARMSTRONG NO");  
    else 
    System.out.println("not ");
}
 }