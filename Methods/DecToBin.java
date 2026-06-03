import java.util.*;
public class DecToBin {
    public static int DecimalToBinary(int dec)
    {
        int pow=0;
        int bin=0;
        while(dec>0){
            int rem=dec%2; //gives remainder
            bin=bin+ rem*(int)Math.pow(10,pow);
            pow++;
            dec=dec/2; //gives quotient
        }
        return bin;
    }
    public static void main(String args[])
    {
        int dec=11;
        System.out.println(DecimalToBinary(dec));
    }
}
