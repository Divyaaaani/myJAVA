import java.util.*;
public class sum {
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("enter num 1: ");
    //     int n1=sc.nextInt();
    //     System.out.println("enter num 2: ");    
    //     int n2=sc.nextInt();

    //     sum(n1,n2);
    // }
    // public static void sum(int a, int b) {
    //     int c=a+b;
    //     System.out.println("sum is: "+c);
    // }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num 1: ");
        int n1=sc.nextInt();    
        System.out.println("enter num 2: ");
        int n2=sc.nextInt();
        // sum(n1,n2); sirf call krne se kuch nhi hoga
        int sum= sum(n1,n2);
        System.out.println("sum is: "+sum);
    }
    public static int sum(int a, int b) {
        int c=a+b;
        return c;
    }
}
