import java.util.*;
class Reversearr {
    static void reverse(int A[]){
        int i=0;
        int j=A.length-1;
        while(i<j){

        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
        i++;
        j--;
        }
    }
    
    public static void main(String[] args){
        int A[]={1,2,3,4,5};
        
        System.out.println("Reversed array:");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        reverse(A);
        System.out.println("\nReversed array:");
        for(int i=0;i<A.length;i++){    
            System.out.print(A[i]+" ");
        }
    }
}

