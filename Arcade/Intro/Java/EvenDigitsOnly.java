public final class EvenDigitsOnly {
	
	boolean evenDigitsOnly(int n) {
	    for(char c : (n+"").toCharArray()) {
	        if(Integer.valueOf(c+"") % 2 != 0) { return false; }
	    }
	    return true;
	}
}