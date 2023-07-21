package Naveen;
import java.util.*;
public class PasssorFail {
	public static void main(String args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,sum=0;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sum=arr[i]+arr[i+1];
		int k=sc.nextInt();
		for(i=0;i<n;i++) {
		if(sum==k)
			System.out.println("true");
		else
			System.out.println("false");
		}
	}
}
