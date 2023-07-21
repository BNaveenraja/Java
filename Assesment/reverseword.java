package Assesment;
import java.util.*;
public class reverseword{
public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print(" ");
	    String a = sc.nextLine();
	    String words[] = a.split(" ");
	    String b = "";
	    for (int i = 0; i < words.length; i++) { 
	            if (i == words.length - 1) 
	              b= words[i] + b; 
	            else
	              b=" "+words[i] + b; 
	            } 
	     System.out.print(b);
	  }
	}
