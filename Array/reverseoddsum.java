package Array;
import java.util.*;
public class reverseoddsum {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int rem,rev=0;
	while(num!=0) {
		rem=num%10;
		rev=rem*10+rem;
		num=num%10;
	}
	System.out.print(rev);
	}
	}

