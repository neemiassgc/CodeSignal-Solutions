public final class DeleteDigit {

	int deleteDigit(int n) {
	    String ref = n+"";
	    int max = 0;
	    for(int i = 0; i < ref.length(); i++) {
	        String s = "";
	        int tmp = 0;
	        for(int j = 0; j < ref.length(); j++) {
	            if(j != i) { s += ref.charAt(j)+""; }
	        }
	        tmp = Integer.valueOf(s).intValue();
	        if(tmp > max) { max = tmp; }
	    }
	    return max;
	}
}