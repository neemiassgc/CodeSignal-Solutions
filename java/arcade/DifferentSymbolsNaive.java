public final class DifferentSymbolsNaive {

	int differentSymbolsNaive(String s) {
	    String str = "";
	    for(char c : s.toCharArray()) {
	        if(!str.contains(c+"")) { str += c; }
	    }
	    return str.length();
	}
}