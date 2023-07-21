package Arrayinterview;
import java.util.*;
public class factoril {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int fact=1,i,num;
	num=sc.nextInt();
	for(i=1;i<=num;i++) {
		fact=fact*i;
		//System.out.println(fact);
	}
	System.out.println(fact);
}
}
