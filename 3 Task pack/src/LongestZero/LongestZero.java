package LongestZero;
import java.util.Scanner;
public class LongestZero {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a sequence of 0 and 1:");
	        String line = scanner.nextLine();

	        System.out.println(longestZero(line));
	}

	
	
	public static String longestZero(String line) {
		String[] subline;
        int max = 0;
        String maxString = "";
        subline = line.split("1");

        for (String elements: subline) {
            if (elements.length() > max) {
                max = elements.length();
                maxString = elements;
            }
        }

        return maxString;
    }
}

