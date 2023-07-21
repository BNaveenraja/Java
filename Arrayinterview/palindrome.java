package Arrayinterview;
import java.util.*;
public class palindrome {
public static void main(String ags[]) {
	Scanner sc=new Scanner(System.in);
    int num=0,temp=0,rev=0,rem=0;
    num=sc.nextInt();
    temp=num;
    while(num!=0) {
    	rem=num%10;
    	rev=(rev*10)+rem;
    	num=num/10;
    }
    if(temp==rev) {
    	System.out.println("the given number "+temp+" is palindrome");
    }
    else {
    	System.out.println("the given numer "+temp+" is not palindrome");
    }
}
}
