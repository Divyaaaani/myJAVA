// import java.lang.*;
// import java.util.Scanner;
// class Expression
// {
//     public static void main(String [] args)
//     {
//         float b,h,ar;
//         System.out.println("enter tthe base anf height of the triangle: ");
//         Scanner sc=new Scanner (System.in);
//         b= sc.nextFloat();
//         h=sc.nextFloat();
//         ar=0.5f*b*h;
//         System.out.println(ar);
//     }
// }

// using herons formula 

import java.lang.*;
import java.util.*;
class Expression{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        double s,ar;

        System.out.println("enter 3 sides: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        // s=sc.nextFloat();
        // ar=sc.nextFloat();   no need to read these from user
        s=(a+b+c)/2f;
        ar= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area="+ ar);
    }
}
