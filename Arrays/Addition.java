// import java.util.*;
// class Addition
// {
//     public static void main(String args[])
//     {
//         // methods of creating 2D arrays
//         int A[][]={{1,2,3},{2,3,4},{4,5,6}}; 
//         int B[][]={{7,8,9},{1,3,5},{2,4,6}};
//         int C[][]=new int[3][3];

//         for (int i=0;i<A.length;i++){
//             for (int j=0; j<A[0].length;j++){
//                 C[i][j]=A[i][j]+B[i][j];
//             }
//         }
//         for (int row[]:C){
//             for (int x:row){
//                 System.out.print(x+" ");
//             }
//             System.out.println(); //after each row a line gap
//         }
//         }
//     }

import java.util.*;
class Addition
{
    public static void main(String args[])
    {
        // methods of creating 2D arrays
        int A[][]={{1,2,3},{2,3,4},{4,5,6}}; 
        int B[][]={{7,8,9},{1,3,5},{2,4,6}};
        int C[][]=new int[3][3];

        for (int i=0;i<A.length;i++){
            for (int j=0; j<A[0].length;j++){
                C[i][j]=A[i][j]-B[i][j]; //* same for multiplication and division
            }
        }
        for (int row[]:C){
            for (int x:row){
                System.out.print(x+" ");
            }
            System.out.println(); //after each row a line gap
        }
        }
    }
