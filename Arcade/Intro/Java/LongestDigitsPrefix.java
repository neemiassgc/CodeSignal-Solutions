public final class LongestDigitsPrefix {

	String longestDigitsPrefix(String inputString) {
		String str = "";
		boolean b = true;
		for(char c : inputString.toCharArray()) {
			if(b && (int)c >= 48 && (int)c <= 57) { str += c+""; }
			else { b = (b) ? !b : b; }
		}
		return str;
	}
}