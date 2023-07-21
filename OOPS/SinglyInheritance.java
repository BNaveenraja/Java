package OOPS;
import java.util.*;
class rect
{
	void display()
	{
	Scanner sc=new Scanner(System.in);
	int l,b,area;
	l=sc.nextInt();
	b=sc.nextInt();
	area=l*b;
	System.out.println(area);
	}
}
class sqrt extends rect
{
	void display1()
	{
	Scanner sc=new Scanner(System.in);
	int area,l;
	l=sc.nextInt();
	area=l*l;
	System.out.println(area);
	}
}


public class SinglyInheritance {
	public static void main(String[] args)
	{
		sqrt obj=new sqrt();
		obj.display1();
		obj.display();
	}

}
