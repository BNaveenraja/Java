package Practice;
import java.util.*;
public class test{

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	  String a=sc.nextLine();
	  String b[]=a.split("\\s");
	  String c="";
	  for(int i=a.length()-1;i<0;i--) {
		c+=b[i];  
	  }
	  System.out.print(b);
	  }
}