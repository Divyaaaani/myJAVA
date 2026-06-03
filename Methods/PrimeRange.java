import java.util.*;
public class PrimeRange {
    static boolean isprime(int n){
        for (int i=2; i<=n/2;i++){
            if (n%i==0){
            return false;
            }
        }
        return true;
    }

    static void Range(int n){
        for (int i=0;i<=n;i++){
            if (isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Range(10);
    }
}