package Naveen;
import java.util.*;
public class pair {
	public static void main(String args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,sum=0;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		for(i=0;i<n;i++) {
		sum=arr[i]+arr[i+1];
		if(sum==k)
			System.out.println("true");
		else
			System.out.println("false");
		}
	}
}
