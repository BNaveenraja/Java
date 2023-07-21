package Pattern;
import java.util.*;
public class pat4 {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	int j=sc.nextInt();
	int a[][]=new int[i][j];
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			a[i][j]=sc.nextInt();
		}
	}
		for(i=0;i<3;i++) {
	    for(j=0;j<3;j++) {
		if(i==1 && j==1) {
			System.out.print(" 5 ");
		}
		else
		System.out.print(" * ");
	}
	System.out.println();
		}
		
		
}
}

