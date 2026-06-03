import java.util.*;
public class Factorial {
    public static int fact(int n){
        // if( n==0 || n== 1){
        //     return 1;
        // }
        // else{
        //     return n*fact(n-1);
        // }
   
        int f=1; 
        for (int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println("factorial of "+n+" is: "+fact(n));
    }
    }
