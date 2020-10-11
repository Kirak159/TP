package BessyEssay;
import java.util.Scanner;
public class BessyEssay {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = 0, k = 0;
            n = scanner.nextInt();
            k = scanner.nextInt();

        String essay = scanner.nextLine();

       
        System.out.println(fixEssay(n, k, essay));

	}

	 public static String fixEssay(int n, int k, String essay) {
	        String[] arr = essay.split(" ");
	        int occPlace = 0;
	        String res = "";

	        res += arr[0];
	        occPlace += arr[0].length();

	        for (int i = 1; i < n; i++) {
	            if (arr[i].length() + occPlace <= k) {
	                res += " " + arr[i];
	                occPlace += arr[i].length();
	            } else {
	                res += "\n" + arr[i];
	                occPlace = arr[i].length();
	            }
	        }
			return res;
}
}
