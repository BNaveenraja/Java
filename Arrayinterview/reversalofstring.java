package Arrayinterview;
import java.util.*;
public class reversalofstring {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	int len=0;
	String rev="";
	len=a.length();
	for(int i=len-1;i>=0;i--) {
		rev=rev+a.charAt(i);
		}
	System.out.println(rev);
}
}
