final class LeastFactorial {
	
	int fact(int n) {
	    return n == 1 ? n : n * fact(n - 1);
	}

	int leastFactorial(int n) {
	    for (int i = 1; true; i++) {
	        int f = fact(i);
	        if (f >= n) return f;
	    }
	}
}