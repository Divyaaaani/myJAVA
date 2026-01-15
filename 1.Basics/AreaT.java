import java.lang.*;
import java.*;
class Areat
{
	public static void main (String args[])
	{
	Scanner sc= new Scanner (System.in);
	double b,h,area;
	System.out.println("ENTER  BASE AND HEIGHT OF TRIANGLE: ");
	b=sc.nextDouble();
	h=sc.nextDouble();
	area= 0.5*b*h;
	System.out.println("area of triangle is : "+area);
	}

}