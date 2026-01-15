// import java.util.*;
// class Searching
// {
//     public static void main(String args[])
//     {
//         Scanner sc= new Scanner(System.in);
//         int A[]={3,9,7,8,12,6,15,5,4};
//         int key;
//         System.out.println("enter the key to search: ");
//         // key=sc.nextInt();
//         // for (int i=0;i<A.length;i++)
//         // {
//         //     if (A[i]==key)
//         //     {
//         //         System.out.println("element found at location: "+i);
//         //         System.exit(0);
//         //     }
//         // }
//         // System.out.println("element not found.....!!");
//         key= sc.nextInt();

//     }
// }

import java.util.*;
class Searching{
    public static void main (String[] args){
        int key;
        Scanner sc= new Scanner (System.in);
        int A[]={3,9,7,8,12,6,15,5,4};
        System.out.println("enter your key to search: ");
        key= sc.nextInt();
        for(int i=0; i<A.length;i++){
            if(A[i]==key){
                System.out.println("element found at location: "+i);
                System.exit(0);
            }
        }
        System.out.println("element not found");
    }
}