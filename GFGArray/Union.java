package GFGArray;

public class Union {
public static void main(String args[]) {        
	int a[]= {1,3,5,7,9};
	int b[]= {1,2,3,6,7};
	int i=0,j=0;
	while(i<a.length && j<b.length) {
	if(a[i]==b[j]) {
		System.out.println(a[i]);
		i++;
		j++;
	}
	else if(a[i]<b[j]) {          //Entha array smaller ah iruko atha tha print uh pananu and antha array va tha increment uh pannanu
	 System.out.println(a[i]);
	 i++;
	}
	else {
		System.out.println(b[j]);
		j++;
	}
		
	}
}
}
