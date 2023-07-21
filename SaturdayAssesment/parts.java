package SaturdayAssesment;
import java.util.*;
public class parts {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	setbuf(stdout,NULL);
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
