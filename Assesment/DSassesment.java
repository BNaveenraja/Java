package Assesment;
import java.util.*;
public class DSassesment {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String c="";
	char b[]=a.toCharArray();
   for(int i=b.length-1;i>=0;i--) { 
	   c+=a.charAt(i);
		System.out.print(b[i]);
	}
	String goal=sc.nextLine();
	if(goal==c)
		System.out.println("true");
	else
		System.out.println("false");

}

}
