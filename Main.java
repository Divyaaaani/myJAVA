import java.lang.*;
import java.util.*;
class Rectangle
{
	int length,width;
	void getdata(int x,int y)
	
	{
		length= x;
		width= y;
	}
	void Area()
	{
	int area=length*width;
	System.out.println("AREA OF REACTANGLE : " +area);
	}
	void Perimeter()
	{
		int p= 2*(length+width);
		System.out.println("PERIMETER OF RECTANGE : " +p);
	}		
}	
class Circle
{
	int radius;
	void getdata(int r)
	{
		radius=r;
	}
	void Area()
	{
	int area=radius*radius;
	System.out.println("AREA OF CIRCLE : "+ area);
	}
	void Perimeter()
	{
		double circumference=2*3.14*radius;
		System.out.println("CIRCUMFERENCE OF CIRCLE IS : "+circumference);
	}	
}
class Main
{
	public static void main (String args[])
	{
		Rectangle Rect= new Rectangle();
		{
			Rect.getdata(8,4);
			Rect.Area();
			Rect.Perimeter();
		}
		Circle Cir =new Circle();
		{
			Cir.getdata(24);
			Cir.Area();
			Cir.Perimeter();
		}			
	}	
}
	





