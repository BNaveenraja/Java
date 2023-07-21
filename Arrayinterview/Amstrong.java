package Arrayinterview;
import java.util.*;
public class Amstrong {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();int temp=n;
	int rem=0,sum=0;
	while(n>0) {
		rem=n%10;
		sum+=rem*rem*rem;
		n=n/10;}
		if(temp==sum) {
			System.out.println("Amstrong number");}
		else{
			System.out.println("Not a Amstrong number");}
}
}
