package Pattern;
import java.util.*;
public class pat2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int arr[][]=new int[r][c];
for(r=0;r<arr.length;r++) {
	for(c=0;c<arr.length;c++) {
	arr[r][c]=sc.nextInt();
	}
}
for(c=0,r=0;c<arr.length;r++) {
	int k=1;
	arr[r][c]=arr[r][c]+arr[r][c];
}
for(c=0,r=0;c<arr.length;r++) {
	int k=2;
	arr[r][c]=arr[r][c]-arr[r][c];
}
for(r=0;r<arr.length;r++) {
	for(c=0;c<arr.length;c++) {
		System.out.print(arr[r][c]+"  ");
	}
	System.out.println();
	}

	}
}

