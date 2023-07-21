/* package codechef; // don't place package name! */
package Codechef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef793
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
	//	int t=sc.nextInt();
		int count0=0,count1=0;
		    int n=sc.nextInt();
		    for(int i=0;i<n;i++){
		    String a=sc.nextLine();
		    if(a=="START38")
		    count0++;
		    else
		    count1++;
            }
	      System.out.println(count0+" "+count1);
		
	}
}
