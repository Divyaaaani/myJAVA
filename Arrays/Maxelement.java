import java.lang.*;
import java.util.*;
class Maxelement
{
    public static void main(String agrs[])
    {
        int A[]={1,2,3,4,5,6,7,8,33,47,90,78};
        int max=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
            max=A[i];
        }
        System.out.println("Max: "+max);
        
    } 
}