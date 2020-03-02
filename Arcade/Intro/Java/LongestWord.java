import java.util.ArrayList;

public final class LongestWord {

	String longestWord(String text) {
	    ArrayList<String> words = new ArrayList();
	    String max = "", str = "";
	    for(int i = 0; i < text.length(); i++) {
	        int c = (int)text.charAt(i);
	        if(c >= 97 && c <= 122 || c >= 65 && c <= 90) {
	            str += text.charAt(i)+"";
	        }
	        else {
	            words.add(str);
	            str = "";
	        }
	        if(i == text.length() - 1) { words.add(str); }
	    }
	    for(String s : words) {
	        if(s.length() > max.length()) { max = s; }
	    }
	    return max;
	}
}