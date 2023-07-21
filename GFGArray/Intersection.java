package GFGArray;

public class Intersection {
public static void main(String args[]) {
	int a[]= {1,3,6,8,9};
	int b[]= {2,4,5,6,7,9};
	int i=0,j=0;
	while(i<a.length && j<b.length) {
		if(a[i]==b[j]) {
			System.out.println(a[i]);
			i++;
			j++;
		}
		else if(a[i]<b[j]) {       //Entha array smaller ah iruko atha mattu tha increment pananu but print panna kudathu!!
			//System.out.println(b[j]);
			i++;}
		else{
				//System.out.println(a[i]);
				j++;
			}
		}
	}
}

