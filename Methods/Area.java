import java.util.*;
class Area{

    static double rect(double l, double b){
        double area= 2*(l+b);
        return area;
    }
    static double cir(double rad){
        double area= 3.14*rad*rad;
        return area;
    }
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the l & b respt: ");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println(rect(l,b)); 

        System.out.println("enter radius: ");
        double rad=sc.nextDouble();
        System.out.println(cir(rad));
    }
}