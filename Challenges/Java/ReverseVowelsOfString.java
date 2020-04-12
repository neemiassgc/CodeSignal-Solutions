public final class ReverseVowelsOfString {
	
	String reverseVowelsOfString(String s) {
	    String output = "", vowels = "";

	    for(char ch : s.toCharArray()) {
	        if((ch+"").matches("[aeiouAEIOU]")) {
	            String ss = ch+vowels;
	            vowels = ss;
	        }
	    }

	    for(int i = 0, x = 0; i < s.length(); i++) {
	        if((s.charAt(i)+"").matches("[aeiouAEIOU]")) {
	            output += vowels.charAt(x);
	            x++;
	            continue;
	        }
	        output += s.charAt(i);
	    }

	    return output;
	}
}