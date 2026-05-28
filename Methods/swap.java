import java.util.*;
public class swap {
    public static void swap(int a ,int b){
        int temp=a;
        a=b;
        b=temp;
        // System.out.println("after swapping a is: "+a);
        // System.out.println("after swapping b is: "+b);
    }
    public static void main(String args[]){
        int a=12;
        int b=88;
        
        swap(a,b);
        // if we print them inside the mian function then u wil l get the original values only becoz
        // java is call by value and not call by reference
        // System.out.println("after swapping a is: "+a);
        // System.out.println("after swapping b is: "+b);
}}
