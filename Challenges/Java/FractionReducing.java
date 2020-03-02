final class FractionReducing {

	int[] fractionReducing(int[] fraction) {
	    int[] res = new int[2];
	    
	    for(int i = 1; i < 10; i++) {
	        if(fraction[0] % i == 0 && fraction[1] % i == 0) {
	            res[0] = fraction[0] / i;
	            res[1] = fraction[1] / i;
	        }
	    }
	    
	    return res;
	}
}	