// AP, GP anf fibonacci series 
import java.lang.*;
import java.util.*;
class Fibonacci 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" To print AP ");
        System.out.println("enter a,d and n no of terms: ");
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        int term=a;
        for( int i=0;i<n;i++)
        {
            System.out.print(term+ ",");
            term=term+d; //important 
        }
        
        System.out.println(" To print GP ");
        System.out.println("enter a,r and n no of terms: ");
      
        int f=sc.nextInt();
        float r=sc.nextFloat(); //ratio = float
        int num=sc.nextInt();
        float terms=a;  //decimal so ffffff
        for(int i=0;i<num;i++)
        {
            System.out.print(terms+",");
            terms=terms+r;  // not a+d gives same result.
        }

        int aa=0,bb=1;
        int cc;
        System.out.println("enter no: ");
        int no=sc.nextInt();
        System.out.print(aa+ " "+ bb);
        for(int i=0;i<no-2;i++) // as a & b are alredy printed
        {
            cc=aa+bb;
            System.out.println(cc);
            aa=bb;
            bb=cc;
        }
    }
}