import java.util.*;

public class Fuel_consp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double l=sc.nextDouble();
        double d=sc.nextDouble();

        if(l<=0 || d<=0){
              if (l <= 0) {
        System.out.println(l + " is an Invalid Input");
    } else {
        System.out.println(d + " is an Invalid Input");
    }
        }
        double L_per_km= (l/d)*100;

        double miles= d*0.6214;
        double gallons= l*0.2642;
// use printf only
        System.out.printf("%.2f%n", L_per_km); //Print x with exactly 2 decimal places, then move to the next line.
        System.out.printf("%.2f%n",miles/gallons);
    }
}


// Compare
// System.out.printf("%.2f", x);
// System.out.printf("%.2f", y);

// Output:

// 13.3317.64

// Because you didn't tell Java to go to the next line.