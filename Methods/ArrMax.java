import java.lang.*;
import java.util.*;
class ArrMax{

    static int max(int A[]){
        int max=A[0];
        for( int i=0;i< A.length;i++){
            if (A[i]> max)
            {
                max= A[i];
            }
        }
        return max; // after completing the for loop only.
    }
    
    public static void  main(String[] args){
        int Arr[]={2,3,4,5,78,999,0,65,32};
       // calling w arrays
       System.out.println(max(Arr));   //methodname(array name) //no []
    }
}