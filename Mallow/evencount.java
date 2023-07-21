package Mallow;
import java.util.*;
public class evencount {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int dif=0;
	int count=0;
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=1;i<n;i++) {
           dif=a[i-1]-a[i];
         //  System.out.print(dif);
           if(dif%2==0)
        	   count++;
	}
	System.out.println(count);
}
}
