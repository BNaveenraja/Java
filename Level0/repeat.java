package Level0;
import java.util.*;
public class repeat {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int arr[] = new int [10];
	for(int i=1;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i = 0; i < arr.length; i++) {  
		for(int j = i + 1; j < arr.length; j++) {  
			if(arr[i] == arr[j])  
				System.out.println("Repeated elements are:"+arr[j]);  
			
		}  
	}  
}
}
