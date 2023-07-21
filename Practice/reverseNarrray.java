package Practice;
import java.util.*;
public class reverseNarrray {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int i=0;
	for(i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int z=sc.nextInt();
	int b[]=new int[n];
	for(i=z-1;i>=0;i--) {
		b[i]=a[i];
			}
}
}
