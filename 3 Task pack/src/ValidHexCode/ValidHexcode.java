package ValidHexCode;
import java.util.Scanner;
import java.util.regex.*;

public class ValidHexcode {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a hex code:");
	        String inputStr = scanner.nextLine();
	        
	    System.out.println("The hex code is valid: "+isValidHexCode(inputStr)) ;  
	}
	 public static boolean isValidHexCode(String str) {
	       
	        Pattern pattern = Pattern.compile("^#([A-Fa-f0-9]{6})$");
	        Matcher matcher = pattern.matcher(str);

	        if (str.charAt(0) != '#') {
	            return false;
	        } else if (str.length() != 7) {
	            return false;
	        } else {
	            return matcher.matches();
	        }
	    }
}
