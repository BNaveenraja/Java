package OOPS;
import java.util.*;
class sum{
	void display()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,ans;
		a=sc.nextInt();
		b=sc.nextInt();
		ans=a+b;
		System.out.println(ans);
	}
}
class rectangle extends sum
{
	void display1()
	{
	Scanner sc=new Scanner(System.in);
	int l,b,area;
	l=sc.nextInt();
	b=sc.nextInt();
	area=l*b;
	System.out.println(area);
	}
}
class square extends rectangle
{
	void display2()
	{
	Scanner sc=new Scanner(System.in);
	int area,l;
	l=sc.nextInt();
	area=l*l;
	System.out.println(area);
	}
}


public class MultilevelInheritance {
	public static void main(String[] args)
	{
		square obj=new square();
		obj.display();
		obj.display1();
		obj.display2();
	}

}
