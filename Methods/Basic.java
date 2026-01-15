import java.lang.*;
import java.util.*;

public class Basic{

    // method definition
    static int sum(int a, int b){
        return a+b;
    }

    // main method
    public static void main(String[] args){
        System.out.println(sum(12,3)); // method calling
    }
}
// new
public class Basic{

    static int max(int a, int b){  // if using int then "return" integer
        if (a> b)
        return a; // return as int
        else 
        return b;
    }

    public static void main( String[] args){
        // int max=max(12,24);
        // System.out.println(max);
        System.out.println(max(12,100));
    } }

// using object passing 

public class Basic{

    static int max(int a, int b){  // if using int then "return" integer
        if (a> b)
        return a; // return as int
        else 
        return b;
    }

    public static void main( String[] args){
        Basic mx= new Basic();  //class name anyword = new classname();
        System.out.println(mx.max(24,90)); // sop(anyword.methodname(values));
    } }