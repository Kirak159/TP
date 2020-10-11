package Rhymes;
import java.util.Scanner;
import java.util.Arrays;
public class Rhymes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the first line:");
        String fst = scanner.nextLine();

        System.out.println("Enter the second line");
        String scnd = scanner.nextLine();

        System.out.println(doesRhyme(fst, scnd));

	}

	 public static boolean doesRhyme(String str1, String str2) {
	        String[] word1 = str1.split(" ");
	        String[] word2 = str2.split(" ");

	        String w1 = word1[word1.length - 1].toLowerCase();
	        String w2 = word2[word2.length - 1].toLowerCase();
	        return (w1.replaceAll("[^aeiou]", "").equalsIgnoreCase(w2.replaceAll("[^aeiou]", "")));
	    }
}
