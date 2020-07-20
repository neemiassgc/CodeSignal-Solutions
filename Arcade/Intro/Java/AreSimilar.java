import java.util.Arrays;

final class AreSimilar {

	void swap(int[] a, int p, int q) {
	    int tmp = a[p];
	    a[p] = a[q];
	    a[q] = tmp;
	}

	boolean areSimilar(int[] a, int[] b) {
	    if(Arrays.equals(a, b)) return true;
	    int p = 0, q = 0;
	    
	    for(int i = 0, k = 2; i < b.length; i++) {
	        if(a[i] != b[i]) {
	            if(k == 2) {
	                p = i;
	                k--;
	                continue;
	            }
	            q = i;
	            k--;
	        }
	        if(k == 0) {
	            swap(b, p, q);
	            return Arrays.equals(a, b);
	        }
	    }
	    
	    return false;
	}
}

