package Assesment;

import java.util.Arrays;
import java.util.Scanner;

public class ksmallest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i=0;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		int k=sc.nextInt();
		System.out.println(+arr[k-1]);
		
	}
	}

