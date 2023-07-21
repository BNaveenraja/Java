package Practice;
import java.util.*;
public class swap {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int i=0,temp=0;
	boolean odd=n%2!=0;
	for(i=0;i<a.length-1;i++) {
			a[i]=sc.nextInt();	
			if(a[i]==odd) {
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			}
	
}
}
