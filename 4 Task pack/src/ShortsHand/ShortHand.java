package ShortsHand;

import java.util.Scanner;

public class ShortHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        
        System.out.println(toStarShorthand(line));
	}
	
	public static String toStarShorthand(String line) {
		String res = "";
        int counter = 1;

        if (line.length() == 0) {
            return "";
        }

        res += line.charAt(0);
        for (int i = 1;i<line.length();i++) {
        	if(line.charAt(i)==line.charAt(i-1) & i != line.length()-1) {
        		counter++;
        		
        	}
        	else if(line.charAt(i)!=line.charAt(i-1) & counter!= 1) {
        		res +="*"+counter+line.charAt(i);
        		counter = 1;
        	}
        	else if (line.charAt(i) == line.charAt(i - 1) && i == line.length()-1) {
        		counter++;
                res += "*"+counter;
            }
        	else {
        		res += line.charAt(i);
        	}
        }
		return res;
		
	}

}
