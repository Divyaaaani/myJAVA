import java.util.*;
class Deletion{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        int A[]=new int[10];
        A[0]=10; A[1]=20; A[2]=30; A[3]=40; A[4]=50;
        int size=5;

        //print array
        // System.out.println("Array before deletion:");
        // for(int i=0;i<size;i++)
        // {
        //     System.out.print(A[i]+" ");
        // }

       System.out.println("\nEnter the element to delete:");
        int x = sc.nextInt();

        // Find index of element
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (A[i] == x) {
                index = i;
                break;
            }
        }

        //left shift
        // for (int i=index+1;i<size-1;i++)
        // {
        //     A[i-1]=A[i];
        // }
                for (int i = index; i < size - 1; i++) {
                A[i] = A[i + 1];
                }
                size--;
        
        System.out.println("Array after deletion:");
        for(int i=0;i<size;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}