package GFGArray;
import java.util.*;
public class kthlargestele {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	int i=0;
	for(i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		System.out.print(arr[i]+" ");
	}System.out.println();
	Arrays.sort(arr);            //To sort the array
	for(i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}System.out.println();
	for(i=arr.length-1;i>=0;i--) {      //To reverse the array
		System.out.print(arr[i]+" ");
	}
	int kth=sc.nextInt();
	System.out.println(arr[kth]);
}
}
