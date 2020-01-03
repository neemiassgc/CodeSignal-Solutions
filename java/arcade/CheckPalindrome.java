public class CheckPalindrome {
	
	boolean checkPalindrome(String inputString) {
	    StringBuilder sb = new StringBuilder(inputString);
	    String reverse = sb.reverse().toString();
	    return (inputString.equals(reverse));
	}
}