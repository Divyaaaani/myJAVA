import java.util.Scanner;
class BinToDec
{
    public static int BinaryToDecimal(int bin)
    {
        int dec=0;
        int pow=0;
       
        while (bin>0){
            int LD=bin%10;
            dec=dec + (LD*(int)Math.pow(2,pow)); // as math.pow returns double we have to typecast it to int
            pow++;
            bin=bin/10;
        } 
        return dec;
    }
    public static void main(String args[])
    {
       int bin=101;
       System.out.println(BinaryToDecimal(bin));
       System.out.println(BinaryToDecimal(1001));
    }
}