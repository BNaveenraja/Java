package Array;
import java.util.*;
public class newarray {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int i=0;
	int a[]=new int[5];
	int b[]=new int[5];
	int ans[]=new int[5];
	for(i=0;i<5;i++) {
		a[i]=sc.nextInt();
	}
	for(i=0;i<5;i++) {
		b[i]=sc.nextInt();
	}
	ans[0]=a[0]+b[1];
	ans[1]=a[1]+b[0];
	ans[2]=a[2]+b[2];
	ans[3]=a[3]+b[4];
	ans[4]=a[4]+b[3];
	for(i=0;i<5;i++) {
    System.out.print(" "+ans[i]);
	}
	System.out.println();
	for(i=0;i<5;i++) {
	if(ans[i]<10)
		System.out.print("1D ");
	else
		System.out.print("2D ");
	}
}
}
