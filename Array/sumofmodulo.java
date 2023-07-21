package Array;
import java.util.*;
public class sumofmodulo {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int a[]=new int[num];
int b[]=new int[num];
int sum[]=new int[num];
int i=0;
for(i=0;i<num;i++) {
	a[i]=sc.nextInt();
}
for(i=0;i<num;i++) {
	b[i]=sc.nextInt();
}
for(i=0;i<num;i++) {
	sum[i]=a[i]+b[num-1-i];
	System.out.print(sum[i] + " ");
}

}

}
