package Mallow;
import java.util.*;
public class zigzagarray {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	for(int i=0;i<n;i++) {
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i]=temp;
		System.out.println(arr);
	}
}
}
