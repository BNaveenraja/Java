package Assesment;
import java.util.*;
public class paint {
public static void main(String args[]) {
	Scanner obj=new Scanner(System.in);
	int a[][]=new int[3][3];
	int min=a[0][0],sum=0;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			a[i][j]=obj.nextInt();
		}
	}
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(min>a[i][i]) {
			min=a[i][i];
			}
		}
	}
	System.out.print(min);
}
}
	