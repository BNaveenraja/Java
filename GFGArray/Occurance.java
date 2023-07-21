package GFGArray;
import java.util.*;
public class Occurance {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int i=0;
	for(i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the number to find");
	int num=sc.nextInt();
    for(i=0;i<n;i++) {
    	if(num==a[i]) {
    		System.out.println(i);
    	}
    	else {
    	}
    }
    System.out.println("The array doesn't contain this number");
}
}
