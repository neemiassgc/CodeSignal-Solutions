public final class FirstDigit {

	char firstDigit(String inputString) {
    	for(char c : inputString.toCharArray()) {
    		if((int)c >= 48 && (int)c <= 57) { return c; }
    	}
    	return '0';
	}		
}