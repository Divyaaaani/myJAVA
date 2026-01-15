import java.lang.*;
import java.util.*;
class Gcd{

    static int GCD(int m,int n){
        while (m!=n){
        if(m>n){
            m=m-n;
        }else{
            m=n-m;
        }
        }
        return m; 
    }
    
    public static void  main(String[] args){
        System.out.println(GCD(35,56));
    }
}