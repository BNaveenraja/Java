package SaturdayAssesment;
import java.util.*;
public class Doctorconsultant {
public static void maun(String args[]) {
	Scanner sc=new Scanner(System.in);
	int age[]=new int[20];
	int i=0;
	for(i=0;i<20;i++) {
		age[i]=sc.nextInt();
	}
	int salary=0;
	if(age[i]<17) {
		salary+=200;
	}
	if(age[i]>17 && age[i]<40) {
		salary+=400;
	}
	if(age[i]>=40) {
		salary+=300;
	}
	System.out.println(salary);
}
}
