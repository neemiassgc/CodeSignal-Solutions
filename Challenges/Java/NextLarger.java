public final class NextLarger {

	int[] nextLarger(int[] a) {
	    int l = a.length;
	    int[] out = new int[l];

	    for(int x = -1, i = 0, f = 0; i < l; i++, f = 0) {
	        for(int j = i; j < l; j++) {
	            if(a[j] > a[i]) {
	                f = a[j];
	                break;
	            }
	        }
	        out[x += 1] = f > 0 ? f : -1;
	    }

	    return out;
	}
}