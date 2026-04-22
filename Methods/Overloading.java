// overloaded method to reverse a int or array
import java.util.*;
class Overloading{
    static int reverse(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    
    static int[] reverse(int A[]){
        int B[]=new int[A.length];
        // reverse copying all the elemts  taking i for A and j for B
        for (int i=A.length-1,j=0;i>=0;i--,j++){
            B[j]=A[i];
        }
        return B;
        
    }

    public static void main(String[] args) {

    int A[] = {1, 2, 3, 4, 5};

    // Call new array reverse
    int B[] = reverse(A);
    System.out.print("\nNew Array Reverse: ");
    for (int x : B) System.out.print(x + " ");

    int num=987654321;
    int revnum=reverse(num);
    System.out.println("\nReversed number: "+revnum);}
}