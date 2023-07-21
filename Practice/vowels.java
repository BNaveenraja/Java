package Practice;
import java.util.*;
public class vowels {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String an=sc.nextLine();
	char b[]=an.toCharArray();
	int count=0;
	for(int i=0;i<an.length()-1;i++) {
		if(b[i]=='a' || b[i]=='e' || b[i]=='i' || b[i]=='0' || b[i]=='u')
			count++;
	}
	System.out.print("Numer of vowels in the given word :"+count);
	
}
}
