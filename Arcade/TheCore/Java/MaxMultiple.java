final class MaxMultiple {
	
	// recursive
	int maxMultiple(int divisor, int bound) {
	    if(bound % divisor == 0) return bound;
	    return maxMultiple(divisor, bound -= 1);
	}
}