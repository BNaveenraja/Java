package Practice;
import java.util.*;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++) {
	//String z=sc.nextLine();
	//System.out.println("Name of te Student :"+z);
	int a=sc.nextInt();
	while(a>0) {
	int T=sc.nextInt();
	int E=sc.nextInt();
	int M=sc.nextInt();
	int P=sc.nextInt();
	int C=sc.nextInt();
	int B=sc.nextInt();
	System.out.println("Tamil= "+ T*1.11);
	System.out.println("English= "+E*1.11);
	System.out.println("Maths= "+M*1.11);
	System.out.println("Physics= "+P*1.42);
	System.out.println("Chemistry= "+C*1.42);
	System.out.println("Biology= "+B*1.42);
	}
}

	}

}
