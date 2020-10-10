package isKaprekar;
import java.util.Scanner;
public class isKaprekar {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int num = 0;

	        System.out.println("Enter a number:");
	          num = scanner.nextInt();
	      
	        System.out.println(isKaprekar(num));

	}
	
	public static boolean isKaprekar(int num) {
		if(num==0 || num==1)
			return true;
		String newnum = String.valueOf(num*num);
		
		if(newnum.length() == 1)
			return false;
		
		String pt1 = newnum.substring(0, newnum.length()/2);
		String pt2 = newnum.substring(newnum.length()/2, newnum.length());
		
		return Integer.parseInt(pt1)+Integer.parseInt(pt2)== num;
	}
	
}
