import java.util.Arrays;

public final class KthLargestElement {

	int kthLargestElement(int[] n, int k) {
	    Arrays.sort(n);
	    return n[n.length - k];
	}
}