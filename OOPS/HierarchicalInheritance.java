package OOPS;
import java.util.*;
class shape{
	void circle()
	{
		Scanner sc=new Scanner(System.in);
		float p=3.14f,r,area;
		r=sc.nextInt();
		area=p*r*r;
		System.out.println(area);
	}
}
class rectangle extends sum
{
	void printarea1()
	{
	Scanner sc=new Scanner(System.in);
	int l,b,area;
	l=sc.nextInt();
	b=sc.nextInt();
	area=l*b;
	System.out.println(area);
	}
}
class square extends sum
{
	void printarea2()
	{
	Scanner sc=new Scanner(System.in);
	int area,l;
	l=sc.nextInt();
	area=l*l;
	System.out.println(area);
	}
}


public class HierarchicalInheritance {
	public static void main(String[] args)
	{
		square obj=new square();
		rectangle obj1=new rectangle();
		obj.circle();
		obj1.printarea1();
		obj.printarea2();
	}

}
