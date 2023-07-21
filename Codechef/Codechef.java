package Codechef;
import java.util.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0) {
		int x=0,count=0;
			int s=sc.nextInt();
			int e=sc.nextInt();
			for(int i=s;i<=e;i++){
					x=i%10;
					if(x==2 || x==3 || x==9)
						count++;
			}      
			System.out.println(count);
		}
	}
}


