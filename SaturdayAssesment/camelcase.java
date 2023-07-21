package SaturdayAssesment;
import java.util.*;
public class camelcase {
public static void main(String args) {
	Scanner sc=new Scanner(System.in);
	String ip=sc.nextLine();
	char ch[]=ip.toCharArray();
	for(int i=0;i<ip.length();i++) {
		if(ch[i]==' ')
			ch[i+1]=(char)(ch[i+1]-32);
		if (i==0) {
			ch[i]=(char)(ch[i]-32);
		}
		
	}
	System.out.println(ch);
}
}
