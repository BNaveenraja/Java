package GFGArray;
import java.util.*;
public class MinMaxEle {
public static void main(String args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int i=0,max=a[0],min=a[0];
	for(i=0;i<a.length;i++) {
		if(max<a[i])
		max=a[i];
		else if(min>a[i])
			min=a[i];
	}
	System.out.print("The max ele in the array is : "+max);
	System.out.println("The m in ele in the arrat is : "+min);
}
}
