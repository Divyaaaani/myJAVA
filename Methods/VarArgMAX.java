import java.lang.*;
import java.util.*;
class varArgMAX{

    //variable arguments as interger
    static void show(int ... A){
        for (int x:A)   // dont fogert int (to declare)
        System.out.println(x);
    }
    public static void main(String[] args){
        show(10,12,123,423,23,54);
        show(new int[] {3,4,56,78,8,9});

        showList("jay","ram","shiva","sag","diyu");

        System.out.println(max(10, 20, 5, 50, 15)); // Output: 50
        System.out.println(max());   // Output: -2147483648 (Integer.MIN_VALUE)
    }

    //variable arguments as strings
    static void showList (String...s){
        for (int i=0;i<s.length;i++)
        System.out.println(i+ " "+s[i]);
    }

    //calculate max 
    static int max(int ...A){
        if(A.length==0)
        return Integer.MIN_VALUE;
        int max=A[0];
        for (int i=1;i<A.length;i++){
            if (A[i]>max)
            max=A[i];
        }
        return max;
    }
     
}