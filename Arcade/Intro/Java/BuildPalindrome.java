public final class BuildPalindrome {

	String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	String buildPalindrome(String st) {
		String res = "";
		if(reverseString(st).equals(st)) { return st; }
		else {
			String sg = "";
			for(char c : st.toCharArray()) {
				sg += c+"";
				res = (st+reverseString(sg));
				if(res.equals(reverseString(res))) { break; }
			}
		}
		return res;
	}
}