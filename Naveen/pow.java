package Naveen;
import java.util.*;
public class pow {
public static void main(String args) {
	Scanner sc=new Scanner(System.in);
	int sum=1;
	int a=sc.nextInt();
	System.out.println(a);
	int b=sc.nextInt();
	for(int i=0;i<b;i++) {
		sum=sum*a;
	}
	System.out.println(sum);
}
}
