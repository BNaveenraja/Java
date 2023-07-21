package SaturdayAssesment;
import java.util.*;
public class duplicatewords {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String b[]=a.split(" ");
	int count1=0;
	for(int i=0;i<a.length();i++) {
		if(b[i]==b[i])
			count1++;
	}
	System.out.println(count1);
}
}
