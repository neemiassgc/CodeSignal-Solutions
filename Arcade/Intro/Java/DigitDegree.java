final class DigitDegree {

	int digitDegree(int n) {
	    int counter = 0;
	    
	    for(; (n+"").length() > 1; counter++)
	        n = (n+"").chars().map(e -> new Integer((char)e+"")).sum();
	        
	    return counter;
	}
}