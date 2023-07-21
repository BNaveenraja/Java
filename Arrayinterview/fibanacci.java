package Arrayinterview;
import java.util.*;
public class fibanacci {
public static void main(String args[]) {
	int a=0,b=1,c,num;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	for(int i=0;i<num;i++) {
		if(i<=1)
			c=i;
		else {
		c=a+b;
		a=b;
		b=c;
		}
		System.out.print(c+" ");
	}
}
}
