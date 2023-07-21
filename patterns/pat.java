package patterns;
import java.util.*;
public class pat {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=0,j=0,k=0;
	for(i=0;i<n;i++) {
		for(j=i;j<=n;j++) {
			System.out.print("  ");
		}
		for(k=0;k<i;k++) {
			System.out.print("x ");
		}
		for(int m=1;m<=i;k++) {
			System.out.print("x ");
		}
		System.out.println();
	}
}
}
