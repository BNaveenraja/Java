package Naveen;

import java.util.Scanner;

public class Minof2numrs {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a<b)
		System.out.print("Minimum of "+a+" and "+b+" is: "+a);
	else
		System.out.print("Minimum of "+a+" and "+b+" is: " +b);
}
}
