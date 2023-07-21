package Level0;
import java.util.*;
public class Matrix {
public static void main(String args[]) 
{
	Scanner sc=new Scanner(System.in);
int a[][]=new int[2][2];	int s=1,s1=1,s2;
for(int i=0;i<2;i++)
{for(int j=0;j<2;j++)
{
	a[i][j]=sc.nextInt();
}
}
int b[][]=new int[2][2];
b[0][0]=a[1][1];
b[1][1]=a[0][0];
for(int i=0;i<2;i++)
{for(int j=0;j<2;j++)
{
	if(i!=j)
	{
		a[i][j]=-a[i][j];
		b[i][j]=a[i][j];
	}
	}}
for(int i=0;i<2;i++)
{for(int j=0;j<2;j++)
{
	System.out.print(b[i][j]+" ");
	}
System.out.println();
}	
for(int i=0;i<2;i++)
{for(int j=0;j<2;j++)
{
if(i==j)
	s=s*b[i][j];
else
	s1=s1*b[i][j];
}}s2=s-s1;
for(int i=0;i<2;i++)
{for(int j=0;j<2;j++)
{
System.out.print((float)b[i][j]/s2+" ");
}System.out.println();
}}}