package Assesment;
import java.util.*;
public class Hexaware {
public static void main(String ags[]) {
	Scanner sc=new Scanner(System.in);
	int num=0,i=2;
	num=sc.nextInt();
	boolean prime=true;
	while(i<num) {
		if(num%i==0) {
			prime=false;
			System.out.println("the given num is not prime");
			i=i+1;
		}
	}
	if(prime==true) {
		System.out.println("the given number is prime");
	}
	}
}