package SaturdayAssesment;
import java.util.*;
public class fingers
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
if(num % 8 ==1)
{
System.out.print("Thumb finger");
}
else if(num % 8 ==2 || num % 8 ==0 )
{
System.out.print("index finger");
}
else if(num % 8 ==3 || num % 8==7)
{
System.out.print("middle finger");
}
else if(num % 8 ==4 || num % 8 == 6)
{
System.out.print("ring finger");
}
else if(num % 8 ==5 )
{
System.out.print("little finger");
}
}
}