package Level0;
import java.util.*;
public class duplicateword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int count=0;
String words[]=str.split(" ");
System.out.println("Duplicate words in a given string :");
for(int i = 0; i < words.length; i++) {    
    count = 1;    
    for(int j = i+1; j < words.length; j++) {    
        if(words[i]==(words[j])) {    
            count++;    
            words[j]="0";
        }
    }
    if(count > 1 && words[i] != "0")    
        System.out.println(words[i]);    
	}

	}
}
