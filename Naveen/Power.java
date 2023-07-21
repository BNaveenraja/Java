package Naveen;
import java.util.*;

class Power {
void powe() {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int pow=1;
	for(int i=0;i<b;i++) {
		pow=pow*a;
	}
	System.out.println(pow);
}
	
	public static void main(String[] args) {
		Power obj=new Power();
		obj.powe();

	}

}
