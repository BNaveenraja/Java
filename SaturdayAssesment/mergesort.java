package SaturdayAssesment;
import java.util.*;
public class mergesort {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	int i=0;
	for( i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for( i=0;i<n;i++) {
		b[i]=sc.nextInt();
	}
	int a1=a.length;
	int b1=b.length;
	int c1=a1+b1;
	int c[]=new int[c1];
	  System.arraycopy(a, 0, c, 0, a1);
      System.arraycopy(b, 0, c, a1, b1);
      Arrays.sort(c);
      System.out.println(Arrays.toString(c));

	}
}
//4->7->8->9->10->15->16->19->