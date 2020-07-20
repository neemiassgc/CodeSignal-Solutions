final class DeleteDigit {

	int deleteDigit(int n) {
	    int max = 0, len = (n+"").length();
	    
	    for(int i = 0; i < len; i++) {
	        String tmp = "";
	        for(int j = 0; j < len; j++) if(j != i) tmp += (n+"").charAt(j);
	        int v = new Integer(tmp);
	        if(v > max) max = v;
	    }
	    
	    return max;
	}
}