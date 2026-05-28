import java.lang.*;
import java.util.*;
class Sum{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers u want to add");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i;
        }

        System.out.println("Sum of the numbers is: "+sum);
    }
}