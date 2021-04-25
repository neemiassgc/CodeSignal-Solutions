final class CountSumOfTwoRepresentations2 {
	
	int countSumOfTwoRepresentations2(int n, int l, int r) {
	    if (2 * r < n || 2 * l > n) return 0;
	    double min = Math.max(l, n - r);
	    double max = Math.min(r, n - l);
	    return (int)(Math.floor((max + min) / 2) - min) + 1;
	}
}