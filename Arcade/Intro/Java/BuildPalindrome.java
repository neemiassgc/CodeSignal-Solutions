final class BuildPalindrome {

	String reverseString(String str) {
	    return new StringBuilder(str).reverse().toString();
	}

	String buildPalindrome(String st) {
	    if(reverseString(st).equals(st)) return st;
	    
	    String sg = "", out = "";
	    for(char c : st.toCharArray()) {
	        out = st+reverseString(sg += c+"");
	        if(out.equals(reverseString(out))) break;
	    }
	    return out;
	}
}