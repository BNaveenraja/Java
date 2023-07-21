package Arrayinterview;
import java.util.*;
public class primenum {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
		int i,a=0;
	for(i=2;i<n/2;i++) {
		if(i%n==0) {
			a=a++;}
	}
	if(a>0) {
		System.out.println("the given num is not a prime");}
	else{
		System.out.println("the given num is prime");}
}
}
