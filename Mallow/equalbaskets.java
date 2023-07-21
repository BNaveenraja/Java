package Mallow;
import java.util.*;
public class equalbaskets {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr1[]=new int[n];
	int arr2[]=new int[n];
	int sum1=0,sum2=0,dif=0,count=0;
	for(int i=0;i<n;i++) {
		arr1[i]=sc.nextInt();
		sum1+=arr1[i];
	}
	for(int j=0;j<n;j++) {
		arr2[j]=sc.nextInt();
		sum2+=arr2[j];
	}
	if(sum1%2==0 && sum2%2==0 || sum1%2==1 && sum2%2==1)
	{
	dif=sum1-sum2;
	if(dif%2==0)																
		count++;
	System.out.println(count);
	}
	else
		System.out.println(-1);
	
}
}
