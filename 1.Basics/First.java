
// import java.lang.*;
// public class First{
//     public static void main(String args[])
//     {
//         System.out.println("Hello world");
//         // System.out.println(arg[0]); //cmd argument run in cmd only but use arg[]


//     }
// }

// Reading form keyboard (sc.next...wali line is used)
// import java.lang.*;
// import java.util.*;
// class First{
//     public static void main(String args[])
//     {
//         Scanner sc= new Scanner(System.in);
//         String name;
//         System.out.println("enter your name: ");
//         name=sc.nextLine();
//         System.out.println("ur name is "+ name);
//     }
// }


// reading from scanner class
import java.util.*;
class First{
    public static void main(String aaaaaaa[]) //args can be anything a , ar, arg,args or any letter 
    {
        
        Scanner sc= new Scanner (System.in);  
        //enter first and then print x
        // float x=sc.nextFloat();    
        // System.out.println(x);

        System.out.println("enter your name: ");
        String name=sc.nextLine();
        System.out.println("hello "+ name);
        

        //to display binary into decimal
        System.out.println("enter binary no. : ");
        sc.useRadix(2);
        int z=sc.nextInt();
        System.out.println(" decimal no is "+ z);
    }
}


