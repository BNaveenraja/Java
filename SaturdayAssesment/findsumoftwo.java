package SaturdayAssesment;
import java.util.*;
public class findsumoftwo {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int arr[]=new int[t];
	for(int i=0;i<t;i++) {
		arr[i]=sc.nextInt();
	}
	int sum=0;
	int find=sc.nextInt();
	int temp=0;
	for(int i=0;i<t;i++) {
		for(int j=0;j<t;j++) {
		sum=arr[i]+arr[j];
		if(sum==find) {
			temp++;
		}
		sum=0;
	}
	}
	if(temp>=1) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
}
}
