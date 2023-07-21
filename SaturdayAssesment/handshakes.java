package SaturdayAssesment;
import java.util.*;
public class handshakes {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int mem=sc.nextInt();
	int count=0;
	for(int i=0;i<mem;i++) {
		for(int j=i+1;j<mem;j++) {
			count++;
		}
	}
	System.out.println(count);
}
}
 