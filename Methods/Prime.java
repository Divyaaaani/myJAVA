import java.lang.*;
import java.util.*;
public class Prime{

    static boolean isprime(int n){ //not int return ttype
        for (int i=2; i<=n/2;i++){
            if (n%i==0){
            return false;
            }
        }
        return true;
        
        
    }

    public static void main(String[] args){
        
        System.out.println(isprime(71));
    }
}