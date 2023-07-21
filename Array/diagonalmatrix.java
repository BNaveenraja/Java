package Array;

import java.util.Scanner;

public class diagonalmatrix {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
			int num1=0,num2=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i==j) {
					num1+=a[i][j];
					}
				 if(i+j==3-1) {
						num2+=a[i][j];
					}
				}
				}
			System.out.println("Sum of right diagonal = "+num1);
			System.out.println("Sum of left diagonal = "+num2);

		}
		}



