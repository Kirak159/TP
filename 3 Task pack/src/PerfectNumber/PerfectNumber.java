package PerfectNumber;

import java.util.Scanner;
public class PerfectNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give me a number");
		 Scanner s = new Scanner (System.in);
         int number=s.nextInt(); 
		System.out.println(number+" is perfect: "+CheckPerfect(number));
	}
	public static boolean CheckPerfect(int n) {
         int summa =0;
         for(int i=1;i<n;i++) {
             if(n%i==0) 
            	 summa+=i;
         }
         return summa ==n;
     } 
}
