package SaturdayAssesment;
import java.util.*;
public class saturday {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String ip=sc.next();
	int i=0;
	String words[]=ip.split(" ");
	char let[]=words[i].toCharArray();
	for(i=0;i<ip.length();i++) {
		System.out.print(let[i]);
	}
}
}
