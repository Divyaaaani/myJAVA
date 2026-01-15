import java.lang.*;

class Concate
{
    public static void main(String[] args)
    {
        int a=2, b= 4;
        System.out.println("sum:"+a+b);  // ans : sum 2 4 wrong
        System.out.println("sum: "+ (a+b));
        System.out.println("sum of a " +a+" and b " +b+ " is " + (a+b));
    }
}