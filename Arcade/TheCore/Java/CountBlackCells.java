final class CountBlackCells {
	
	int gcd(int a, int b) {
	    if (a == 0) return b;
	    if (b == 0) return a;
	    
	    return a > b ? gcd(a % b, b) : gcd(a, b % a);
	}

	int countBlackCells(int n, int m) {
	    
	    if (n == m) return n + 2 * (n - 1);
	    if (n == 1 || m == 1) return n * m;

	    return n + m - gcd(n, m) + (gcd(n, m) - 1) * 2;
	}
}