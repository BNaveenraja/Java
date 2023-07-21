package Practice;
import java.util.*;
public class space {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
		char b[]=a.toCharArray();
		int count=1;
		for(int i=0;i<a.length();i++) {
			if(b[i]==' ')
				count++;
		}
			System.out.print(count);
	}
}
