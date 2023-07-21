package Practice;
import java.util.*;
public class maxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int max;
for(int i=0;i<=n;i++) {
	a[i]=sc.nextInt();
	if(a[i]<a[i+1])
		max=a[i+1];
	a[i]++;
}
	}

}
