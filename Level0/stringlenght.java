package Level0;
import java.util.*;
public class stringlenght {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int length=0;
	char ch[]=str.toCharArray();
	for(char c : ch) {
		length++;
	}
	System.out.println("Length of the Array is :"+length);
}
}
