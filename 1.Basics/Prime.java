// import java.util.*;
//  class Prime{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter a number");
//         int n=sc.nextInt();
//         // int count=0;
//         boolean isPrime=true;
//         for (int div=2;div<n;div++){
//             if(n%div==0){
//                 isPrime=false;
//                 // break;
//             }
//         }
//         if (isPrime){
//             System.out.println(n+" is a prime number");
//         }
//         else{       
//          System.out.println("not a prime number");
//         }


//     }
//  }

import java.util.*;
class Prime{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
       int div=2;
        while(div<n){
            if(n%div==0){
                System.out.println("not a prime number");
                return;
            }
            div++;
        }
 }}