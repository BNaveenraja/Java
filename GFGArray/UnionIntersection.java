package GFGArray;
import java.util.*;
public class UnionIntersection {
public static  void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	int i=0,inter=0;;
	for(i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++) {
		b[i]=sc.nextInt();
	}
	for(i=0;i<n;i++) {
		if(a[i]>b[i]) {
			inter=a[i];
		}
	}
	System.out.println(inter);
}
}
