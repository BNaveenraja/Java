package Array;
import java.util.*;
public class borderproduct {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int i=0,j=0;
	int product=1;
	int arr[][]=new int[n1][n2];
	for(i=0;i<n1;i++) {
		for(j=0;j<n2;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<n1;i++) {
		for(j=0;j<n2;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	for(i=0;i<n1;i++) {
		for(j=0;j<n2;j++) {
			if(i==0 || j==0 || i==n1-1 || j==n2-1) {
				product*=arr[i][j];
			}
		}
	}
	System.out.println(product);
}

}
