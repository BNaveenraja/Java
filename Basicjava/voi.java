package Basicjava;

public class voi {

	package Level0;
	import java.util.*;
	public class matric{
	public static void main(String[] args) {
	            int[][] matrix = new int[3][3];
		        Scanner pk = new Scanner(System.in);
	            System.out.println("Enter matrix elements:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                matrix[i][j] = pk.nextInt();
		            }
		        }
		        int[] op= new int[9];
		        int in = 0;
	             for (int i = 0; i < 3; i++) {
		            if (i % 2 == 0) {
		                for (int j = 0; j < 3; j++) {
		                    op[in++] = matrix[j][i];
		                }
		            } else {
		                for (int j = 2; j >= 0; j--) {
		                    op[in++] = matrix[j][i];
		                }
		            }
		        }
		        System.out.println("Output:");
		        for (int i = 0; i < 9; i++) {
		            System.out.print(op[i]);
		        }
		    }
		}
}
