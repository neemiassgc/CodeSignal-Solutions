import java.util.Arrays;

final class PalindromeRearranging {

	boolean palindromeRearranging(String inputString) {
		int[] abc = new int[26];
	    for(int i = 0; i < inputString.length(); i++) {
	        abc[inputString.charAt(i) - 'a']++;
	    }	
	    
	    return inputString.length() % 2 ==
	    Arrays.stream(abc).map(n -> n % 2 == 1 ? 1 : 0).sum();
	}
}