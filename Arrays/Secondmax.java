// class Secondmax
// {
//     public static void main(String args[])
//     {
//         int A[]={99,100,52,9,8,999};
//         int max1,max2;
//         max1=max2=A[0];

//         for(int i=0;i<A.length;i++)
//         {
//             if(A[i]>max1)
//             {
//                max2=max1;  //store max1 beforehand in max2 coz badme max1 value willbe changed 
//                max1=A[i];
//             }
//             else if(A[i]>max2)
//             {
//                 max2=A[i];
//             }
//         }
//         System.out.println("second max is: "+max2);
//     }
// }

import java.lang.*;
class Secondmax
{
    public static void main(String args[])
    {
        int max1,max2;
        int A[]={99,100,52,9,8,999};
             max1=max2=A[0];
        for (int i=0;i<A.length;i++){
           
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
            else if (A[i]>max2){
                max2=A[i];
            }
        }

        System.out.println("second max is: "+max1+","+max2);



    }
}
