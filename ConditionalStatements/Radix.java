 import java.util.*;
 public class Radix
 {
    public static void main(String[] args)
    {
        // int n;   //young or old
        // System.out.println("Enter the number: ");
        // Scanner sc=new Scanner(System.in);
        // n=sc.nextInt();

        // if(n>=14 && n<=55)
        // {
        //     System.out.println("young");
        // }
        // else if(n<14)
        // {
        //     System.out.println("kid");
        // }
        // else
        // System.out.println("old");

        // String num;  //find the radix of a number  given in a string

        // System.out.println("enter a number: ");
        // Scanner scan=new Scanner(System.in);
        // num=scan.nextLine();

        // if(num.matches("[01]+"))
        // System.out.println("Binary Radix=2");

        // else if(num.matches("[0-7]+"))
        // System.out.println("Octal Radix=8");
        
        // else if(num.matches("[0-9]+"))
        // System.out.println("Decimal Radix=10");

        // else if(num.matches("[a-f 0-9]+"))
        // System.out.println("hexadecimal Radix=16");

        String num;
        System.out.println("enter any number: ");
        Scanner sc =  new Scanner(System.in);
        num= sc.nextLine();

        if(num.matches("[10]+"))
        System.out.println("binary");
        else if(num.matches("[a-f 0-9]+"))
        System.out.println("hexadecimal");
        else if(num.matches("[0-9+]"))
        System.out.println("decimal");
        else if(num.matches("[0-7]+"))
        System.out.println("Octal");
    }
 }