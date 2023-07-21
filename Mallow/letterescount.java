package Mallow;
import java.util.*;
public class letterescount {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String ip=sc.nextLine();
	char b[]=ip.toCharArray();
	int count=0;
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b.length;j++) {
			if(b[i]==b[j]) {
				count++;
			}
		}
		
		System.out.println(b[i]+":"+count);
		count=0;
	}
}
}
