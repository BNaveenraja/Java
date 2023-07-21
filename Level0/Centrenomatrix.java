package Level0;
import java.util.*;
public class Centrenomatrix {
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
if(i==1&&j==1)
System.out.print(a[i][j]);
else if(i==0&&j==0||i==0&&j==2||i==2&&j==0||i==2&&j==2)
	 System.out.print(a[1][1]+a[i][j]+" ");

else
	 System.out.print("*"+" ");
	}
	 System.out.println();
	}

}
}
