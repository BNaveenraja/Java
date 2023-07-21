package Assesment;
import java.util.*;
public class maventic1 {
	public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int ip=sc.nextInt();
int a,max=0;
while(ip>0) {
		a=ip%1000;
		ip=ip/10;
		if(a>max)
			max=a;
	}
System.out.print(max);
   }
}
