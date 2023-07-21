package Array;
import java.util.Scanner;
public class hash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int N = scanner.nextInt();
        
        boolean isPossible = false;
        
        for (int d = 0; d < N; d++) {
            int KK = N - (d * d);
            int sqrtKK = (int) Math.sqrt(KK);
            
            if (sqrtKK * sqrtKK == KK) {
                isPossible = true;
                break;
            }
        }
        
        if (isPossible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
