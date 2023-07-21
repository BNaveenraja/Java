package Level0;
import java.util.*;
public class addcolmatrix {
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
		if(j==1)
			System.out.print(a[i][j+1]-a[i][j]+" ");
		else if(j==0)
			System.out.print(a[i][j+1]+a[i][j+2]+" ");
		else
			System.out.print(a[i][j]+" ");
	}
	System.out.println();	}
}
}