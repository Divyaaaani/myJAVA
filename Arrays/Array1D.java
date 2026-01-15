import java.lang.*;
class Array1D
{
    public static void main(String args[])
    {
        // methods of creating arrays
        int A[]=new int[10];
        System.out.println(A.length);
        int B[]={1,2,3,4,5};
        int C[];
        C=new int[10];
        C[6]=90;
        int []D=new int[5];
        
        B[2]=15; // will change B OF i=2 AS 15
        for(int i=0;i<B.length;i++)  //traversing  using counter control for loop
        {
            System.out.println(B[i]);
        }
        // by using for each element 
        for(int x:C)
        System.out.println(x);

    }
}