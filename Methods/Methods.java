//NOTE: In java there is only pass by value and not any pass by refernce.
import java.lang.*;
import java.util.*;

public class Methods { 

    //main class
    public static void main(String[] args){
    sum();  //Function call
    greetings();

    int ans =sum2(); // for return type stored in variable
    System.out.println("3) the ans is " +ans);

    String greet=greetings2();  // can't use return directly,need to be stored in some
    System.out.println(greet);

    int sum3= sum3(50,33);  //call by passing parameters
    System.out.println("5)sum3 is : " +sum3);

    String str=str("Divyani");
    System.out.println(str);

    swap(12,88);
    }

    static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num 1: ");
        int n1=sc.nextInt();
        System.out.println("enter num 2: ");
        int n2=sc.nextInt();
        int sum= n1+n2;
        System.out.println("1.Sum of n1 and n2 is "+ sum);
        }

        //return the value
     static int sum2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num 1: ");
        int n1=sc.nextInt();
        System.out.println("enter num 2: ");
        int n2=sc.nextInt();
        int sum= n1+n2;
        return sum;   //whenever return hits function over
    
          //System.out.println(" this will never execute.");
        }

    static void greetings(){
        Scanner s= new Scanner(System.in);
        System.out.println("2.NAMASTE DIYUU");
    }

    //Return a String
    static String greetings2(){
        String greet= "4) hello babe!!";
        return greet;
    }

    //pass the value of numbers while calling the method in main()
    static int sum3(int a,int b){
        int sum= a+b;
        return sum;
    }

    // passing the vlaue using str
    static String str(String name){  //imp to pass parameters
        String msg= "6) hello " + name;
        return msg;
    }

    static void swap(int a,int b){  // use void coz no return value else all int,string or any other datatype must hv return value
        int temp=a;
        a=b;
        b= temp;    
        System.out.println(a+" "+b);
    }

}

