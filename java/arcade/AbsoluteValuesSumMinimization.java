public final class AbsoluteValuesSumMinimization {

	int absoluteValuesSumMinimization(int[] a) {
	    int[] n = new int[a.length];
	    for(int i = 0; i < a.length; i++) {
	        for(int j : a) {
	            n[i] += Math.abs(j - a[i]);
	        }
	    }
	    int lower = n[0];
	    for(int i : n) { lower = (i < lower) ? i : lower; }
	    return a[Arrays.binarySearch(n, lower)];
	}
}