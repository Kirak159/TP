package OverTime;
import java.util.Scanner;
public class OverTime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double[] inputData = new double[4];

        /* Read data */
        System.out.println("Enter start time, end time, hourly rate and overtime multiplier");
        for (int i = 0; i < 4; i++) {
                inputData[i] = scanner.nextDouble();
            
        }
	}
	
	
	public static String overTime(double[] arr) {
        double sum = 0;

        if (arr[1] > 17) {
            sum =sum+ (arr[1] - 17) * (arr[2] * arr[3]);
            sum =sum+ (17 - arr[0]) * arr[2];
        } else {
            sum += (arr[1] - arr[0]) * arr[2];
        }

        return String.format("$%.2f", sum);
    }

}
