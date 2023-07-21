package Level0;
import java.util.*;
public class CharSearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b=sc.nextLine();
	
	if(a.contains(b))
		System.out.println("Present");
	else
		System.out.println("Not Present");

}
}
