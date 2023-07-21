package Practice;
import java.util.*;
public class palindromepractice {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int rem=0,rev=0,temp=n;
	while(n>0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(temp==rev) 
	{
		System.out.println(temp+" is a palindrome number");
	}
	else
		System.out.println(temp+" is not a palindrome number");
}
}
