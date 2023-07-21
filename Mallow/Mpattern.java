package Mallow;
import java.util.*;
public class Mpattern {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int fp=0,sp=0,i=1,j=i;
	int mid=n/2+1;
	for(i=1;i<=n-1;i++) {
		for(j=1;j<=n;j++) {
			if(j==1 || j==n || (j==fp || j==sp) && i<=mid) {
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
		if(i==1) {
			fp=1;
			sp=n;
		}
		fp++;
		sp--;
	}
}
}
