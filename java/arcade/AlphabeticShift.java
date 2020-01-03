public final class AlphabeticShift {

	String alphabeticShift(String inputString) {
	    String str = "";
	    for(char c : inputString.toCharArray()) {
	        str += (c != 'z') ? (char)(c + 1) : "a";
	    }
	    return str;
	}
}