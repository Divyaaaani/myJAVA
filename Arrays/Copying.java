import java.util.*;
class Copying{
    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        int A[]=new int[10];
        A[0]=10; A[1]=20; A[2]=30; A[3]=40; A[4]=50;
        int size=5;

        int B[]=new int[size];

        //copying elements from A to B
        for (int i=0;i<size;i++){
            B[i]=A[i];
        }

        System.out.println("Elements of array B:");
        for (int i=0;i<size;i++){
            System.out.print(B[i]+" ");
        }
    }
}