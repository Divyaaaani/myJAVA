import java.lang.*;
import java.util.*;
public class Prime{
    //better
    static boolean isprime(int n){ //not int return ttype
        for (int i=2; i<=n/2;i++){ // i=n-1
            if (n%i==0){
            return false;
            }
        }
        return true;
    }

    static boolean isprime2(int n){
        boolean isPrime=true;
        for (int i=2; i<=n-1;i++){
            if (n%i==0){
            isPrime=false;
            break;
            // return isPrime; // YHAPR BHI likh skte hai coz we wont wait to return after diving one no.
            }
        }
        return isPrime;
    }

    //more optimized
    static boolean isprime3(int n){
        for (int i=2; i<=Math.sqrt(n);i++){
            if (n%i==0){
            return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        
        System.out.println(isprime2(12));
         System.out.println(isprime3(2));
    }
}