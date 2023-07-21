package Practice;
import java.util.*;
public class pattern2 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int r=scanner.nextInt();
	        int temp=0;
	        for(int i=r;i>=1;i--)
	        {
	            for(int j=r;j>=i;j--){
	                System.out.print(j+" ");
	                temp =j;}
	            for(int k=r-i+1;k<r;k++)
	            {
	                System.out.print(temp+" ");
	            }
	            System.out.println();
	        }
	    }
	    }