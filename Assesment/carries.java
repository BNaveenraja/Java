package Assesment;
import java.util.*;
public class carries {
public static void main(String arsgs[]) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int rem1,rem2,sum,count=0;
	while(x>0) {
		rem1=x%10;
		rem2=y%10;
		x/=10;
		y/=10;
		sum=rem1+rem2;
		if(sum>9)
			count++;
	}
	System.out.println(count);
}
}