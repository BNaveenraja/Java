package Naveen;
import java.util.*;
public class Ascendingorder1 {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String a=sc.next();
      int len=a.length();
      int i=0;
      char b;
      char c[]=new char[len];
      for(i=0;i<len;i++) {
    	 b=a.charAt(i);
    	  if(b==b) {
    		  c[i]=b;
    	  }
       }
      System.out.println(c[i]);
	}

}
