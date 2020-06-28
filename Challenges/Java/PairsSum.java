final class PairsSum {

	boolean contains(int[] a, int e) {
	    for(int i : a) if(i == e) return true;
	    return false;
	}

	int pairsSum(int[] a) {
	    int pairs = 0;
	    
	    for(int i = 0; i < a.length; i++) {
	        for(int j = i + 1; j < a.length; j++) {
	            if(contains(a, a[i] + a[j])) pairs++;
	        }
	    }
	    
	    return pairs;
	}
}