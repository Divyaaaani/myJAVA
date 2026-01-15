/*
import java.lang.*;
import java.util.Scanner;
class Area
{
	public static void main (String args[])
	{
	Scanner sc=new Scanner(System.in);
	double b,h,area;
	System.out.println("ENTER  BASE AND HEIGHT OF TRIANGLE: ");
	b=sc.nextDouble();
	h=sc.nextDouble();
	area= 0.5*b*h;
	System.out.println("area of triangle is : "+area);
	}

}
*/

import java.lang.*;
import java.util.Scanner;
class Scalene
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double a,b,c,area;
		double s;
		System.out.println(" enter the 3 sides of triangle= ");
		a=sc.nextDouble();    // add cursor down ctrl+alt+ down/up
		b=sc.nextDouble();
		c=sc.nextDouble();
	
		s=(a+b+c)/2f;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("s=" +s);
		System.out.println("area="+area);

	}
}