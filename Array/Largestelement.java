package Array;
import java.util.*;
public class Largestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     int max=0;
     for(int i=0;i<n;i++) {
    	 a[i]=sc.nextInt();
    	 }
     for(int i=0;i<n;i++) {
    	if( max>a[i])
    	 max=a[i];
     }
    	 System.out.print(max);
	}

}
