package GFGArray;
import java.util.*;
public interface amstrong {
public static void main(String args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int rem,length=0;
	while(num>0) {
		rem=num%10;
	    length=length+rem*rem*rem;
	    num/=10;
	}
}
}
