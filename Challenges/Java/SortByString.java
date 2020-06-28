final class SortByString {
	
		String sortByString(String s, String t) {
	    String out = "";
	    
	    for(char c : t.toCharArray()) {
	        while(s.contains(c+"")) {
	            s = s.replaceFirst(c+"", "");
	            out += c+"";
	        }
	    }
	    
	    return out;
	}
}