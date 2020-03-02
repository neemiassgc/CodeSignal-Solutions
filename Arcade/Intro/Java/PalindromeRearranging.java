public class PalindromeRearranging {

	boolean palindromeRearranging(String inputString) {
		int[] abc = new int[26];
		int c = 0;
		for(int i = 0; i < inputString.length(); i++) {
		    abc[inputString.charAt(i) - 'a']++;
		}
		for(int i : abc) { c += (i % 2 == 1) ? 1 : 0; }
		return (inputString.length() % 2 == c);
	}
}