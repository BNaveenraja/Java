package Mallow;
import java.util.*;
public class largestrow {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int c=sc.nextInt();
	int arr[][]=new int[r][c];
	int sum=0;
	int i=0;
	int j=0;
	int ans=0;
	for(i=0;i<r;i++) {
		for(j=0;j<c;j++) {
		arr[i][j]=sc.nextInt();
		sum=sum+arr[i][j];
	}
		if(ans<sum)
			ans=sum;
		sum=0;
	}
	System.out.println(ans);
	
}
}
