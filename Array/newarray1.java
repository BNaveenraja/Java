package Array;
import java.util.*;
public class newarray1 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int i=0;
	int a[]=new int[5];
	int b[]=new int[5];
	int ans[]=new int[5];
	for(i=0;i<5;i++) {
		a[i]=sc.nextInt();
	}
	for(i=0;i<5;i++) {
		b[i]=sc.nextInt();
	}
	for(i=0;i<5;i++) {
		ans[i]=a[i]+b[i+1];
		if(i==2)
			ans[i]=a[i]+b[i];
	//}
	//for(i=0;i<5;i++) {
System.out.print(ans[i]);
	}
}
}
