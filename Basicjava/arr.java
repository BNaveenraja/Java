package Basicjava;
import java.util.*;
public class arr {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int i;
int sum=0;
for(i=4;i>=1;i--) {
	a[i]=sc.nextInt();
}
for(i=4;i>=1;i--) {
	if(a[i]%2!=0)
		sum=sum+a[i];
}
Arrays.sort(a);
System.out.println(a[i]);
}
}

