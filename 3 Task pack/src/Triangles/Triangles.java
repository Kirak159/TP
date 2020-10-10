package Triangles;
import java.util.Scanner;
public class Triangles {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        double x = 0, y = 0, z = 0;

	        
	        System.out.println("Enter x, y and z:");
	        if (scanner.hasNextDouble()) {
	            x = scanner.nextDouble();
	        } else {
	            System.out.println("Wrong input! We need a number!");
	            System.exit(0);
	        }

	        if (scanner.hasNextDouble()) {
	            y = scanner.nextDouble();
	        } else {
	            System.out.println("Wrong input! We need a number!");
	            System.exit(0);
	        }

	        if (scanner.hasNextDouble()) {
	            z = scanner.nextDouble();
	        } else {
	            System.out.println("Wrong input! We need a number!");
	            System.exit(0);
	        }

	        
	        System.out.println(rightTriangle(x, y, z));
	    }

	    
	    public static boolean rightTriangle(double a, double b, double c) {
	        if (a * a + b * b == c * c ||
	            a * a + c * c == b * b ||
	            b * b + c * c == a * a) {
	            return true;
	        }
	        else
	        	return false;
	    }

}
