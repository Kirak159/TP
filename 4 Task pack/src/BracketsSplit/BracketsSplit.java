package BracketsSplit;
import java.util.*;
public class BracketsSplit {

	public static void main(String[] args) {
		
	}
	
	public static String split(String str) {
		  String subStr = "";
	      Stack<String> s = new Stack<String>();
	      int bracketsCount = 0;
	      for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == '(') {
	                subStr += str.charAt(i);
	                bracketsCount++;
	            } else if (str.charAt(i) == ')') {
	                subStr += str.charAt(i);
	                bracketsCount--;
	            }

	            if (bracketsCount == 0) {
	                s.push(subStr);
	                subStr = "";
	            }

	            if (bracketsCount != 0 && i == str.length() - 1) {
	                return "Not balanced string";
	            }
	        }

	        return Arrays.toString(s.toArray());
	}

}
