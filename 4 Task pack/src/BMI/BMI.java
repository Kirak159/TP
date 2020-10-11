package BMI;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your weight");
	        String weight = scanner.nextLine();

	      
	        System.out.println("Enter your height");
	        String height = scanner.nextLine();

	       
	        System.out.println(BMI(weight, height));

	}
	
	
	
	public static double weight(String weght) {
		double weight = Double.parseDouble(weght.substring(0, weght.indexOf(" ")));
				 if (weght.contains("pounds")) {
				        weight *= 0.454;
				    }
		return weight;
	}
	public static double height(String heght) {
		double height = Double.parseDouble(heght.substring(0, heght.indexOf(" ")));
			if (heght.contains("inches")) {
		        height /= 39.370;
		    }
		return height;
	}

    
	public static String BMI(String w, String h) {
		String res = "";
		double weight = weight(w), height  = height(h);
        if (weight < 0 || height < 0) {
            return "Wrong input!";
        }

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            res =  String.format("%.1f Underweight", bmi);
        } else if (bmi > 18.5 && bmi < 24.9) {
            res = String.format("%.1f Normal weight", bmi);
        } else if (bmi > 25) {
            res = String.format("%.1f Overweight", bmi);
        }

        return res;
    }

}
