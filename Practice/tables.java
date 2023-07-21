package Practice;
import java.util.*;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 System.out.println("Enter the 1st table="+n);
 for(int i=1;i<=10;i++) {
	 int mul=n*i;
	 System.out.println(n+" X "+i+" = "+mul);}
 int n1=sc.nextInt();
System.out.println("Enter the 2nd table="+n1);
 for(int i=1;i<=10;i++) {
	 int mul=n1*i;
	 System.out.println(n1+" X "+i+" = "+mul);}
 int n2=sc.nextInt();
 System.out.println("Enter the 3rd table="+n2);
 for(int i=1;i<=10;i++) {
	 int mul=n2*i;
	 System.out.println(n2+" X "+i+" = "+mul);}
	}

}
