final class LongestDigitsPrefix {

	String longestDigitsPrefix(String inputString) {
	   String output = "";
	   
	   for(char ch : inputString.toCharArray()) {
	       if((ch+"").matches("\\d")) output += ch;
	       else break;
	   }
	   
	   return output;
	}
}