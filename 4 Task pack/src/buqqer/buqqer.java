package buqqer;
import java.util.Scanner;
public class buqqer {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int num = 0;
	        System.out.println("Enter an integer number:");
	            num = scanner.nextInt();
	  
	        System.out.println(bugger(num));
	}
	public static int bugger(int n) {
        int res = 0;

        if (n < 0) {
            return 0;
        }

        while (n > 9) {
            int s = 1;
            res++;

            while (n>0){
            	s *= n % 10;
            	n /=10;
            }
            n = s;
        }

        return res;
}
}