import java.lang.*;
import java.util.*;
class Si
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		int p,r,t;
		double Si;
		System.out.println(" enter principle ,rate , time : ");
		p=sc.nextInt();
		r=sc.nextInt();
		t=sc.nextInt();
		Si=(p*r*t)/100;
		System.out.println(" SIMPLE INTEREST "+Si);
		
	}
}	
	