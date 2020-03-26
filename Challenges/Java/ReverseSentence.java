final class ReverseSentence {
	
	String reverseSentence(String sentence) {
	    String out = "";
	    String[] parts = sentence.split(" ");
	    for(int i = parts.length - 1; i >= 0; i--) {
	        out += parts[i]+" ";
	    }
	    return out.trim();
	}
}