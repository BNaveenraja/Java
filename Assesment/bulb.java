package Assesment;
import java.util.*;
public class bulb {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	char b[]=a.toCharArray();
	int i=0;
	for(i=1;i<=b.length;i++) {
		if(b[i]=='1') 
			 b[i]='0';
		else if(b[i]=='0')
			b[i]='1';
			}
	System.out.print(b[i]);
}
}
