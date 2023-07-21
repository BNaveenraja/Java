package Array;
import java.util.*;
public class searchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int a[]=new int[n];
        int flag=0;
        int index=0;
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        	int search=sc.nextInt();
        	if(a[i]==n) {
        		flag=1;
        	index=a[i];}
        	if(flag==1)
        		System.out.println("Element is found at index: "+i);
        }
	}

}
