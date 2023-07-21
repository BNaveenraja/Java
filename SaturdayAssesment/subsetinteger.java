package SaturdayAssesment;
import java.util.*;
public class subsetinteger {
public static void main(String args[]) {
	int ip[]= {2,3,4};
	for(int i=0;i<ip.length;i++) {
		for(int j=i;j<ip.length;j++){
			//op[i]=ip[i]ip[j];
			if(ip[i]==ip[j]) {
				System.out.print(ip[i]+"  ");
			}
			else {
			System.out.print(ip[i]+","+ip[j]+"  ");
			}
		}
		}
	for(int i=0;i<ip.length;i++) {
		System.out.print(ip[i]+",");
	}
	//System.out.print("  ");
	//System.out.println(count);
}
}
