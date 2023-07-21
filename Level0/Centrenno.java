package Level0;
import java.util.*;
public class Centrenno {
	public static void main(String args[]) 
	{
	 Scanner sc=new Scanner(System.in);
	 int a[][]=new int[3][3];	
	 for(int i=0;i<3;i++)
	{for(int j=0;j<3;j++)
	{
	a[i][j]=sc.nextInt();
	}	
	}
	 for(int i=0;i<3;i++)
		{for(int j=0;j<3;j++)
		{
	 if(j==0||j==2||i==0||i==2)
	 System.out.print("*");
	 else
		 System.out.print(a[1][1]);
		}
		 System.out.println();
		}

}}
