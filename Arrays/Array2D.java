import java.util.*;
class Array2D
{
    public static void main(String args[])
    {
        // methods of creating 2D arrays
        int A[][]=new int[3][4]; // 3 rows and 4 columns
        System.out.println("Number of rows: " + A.length);
        System.out.println("Number of columns in row 0: " + A[0].length);
        
        int B[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int C[][];
        C=new int[2][3];
        C[1][2]=90;
        
        // Modifying an element
        B[1][1]=15; // will change B[1][1] to 15
        
        // Traversing using nested for loops
        System.out.println("Elements of array B:");
        for(int i=0;i<B.length;i++) {
            for(int j=0;j<B[i].length;j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        
        // Using for-each loop to traverse
        System.out.println("Elements of array C:");
        for(int[] row : C) {
            for(int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}