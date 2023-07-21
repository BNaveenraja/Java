package SaturdayAssesment;
import java.util.*;
public class gcd {
	public static void rec(int x,int y) {
		int gcd=0;
		for(int i=1;i<=x && i<=y;i++) {
			if(x%i==0 && y%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
	}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	rec(x,y);
}
}
