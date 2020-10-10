package nextPrime;
import java.util.Scanner;
public class NextPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int num = 0;

	        /* Read a number */
	        System.out.println("Enter an integer number:");
	            num = scanner.nextInt();
	        System.out.println(nextPrime(num));
	}

	public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
	public static int nextPrime(int num) {
		if (isPrime(num))
			return num;
		else {
			while (!isPrime(num)){
				num++;
			}
			return num;
		}
	}
}
