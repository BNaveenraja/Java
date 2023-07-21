package Naveen;
import java.util.Scanner;
public class Marksgrade {
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int m=sc.nextInt();
 int i,sum=0;
 int sub=0;
 int rem=0;
 for(i=1;i<m;i++) {
	 rem=i%n==0;
	 sub=sub+rem;
	 sum=sum+i;
 }
 sum=sum-sub;
 System.out.println(sum);
 System.out.println(sub);

	}

}
