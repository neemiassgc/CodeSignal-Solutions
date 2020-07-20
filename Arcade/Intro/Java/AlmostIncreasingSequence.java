final class AlmostIncreasingSequence {

	boolean almostIncreasingSequence(int[] sequence) {
	    int last = -0x186a0, lastPrev = -0x186a0, c = 0;
	    
	    for(int n : sequence) {
	        if(n <= last) {
	            c++;
	            if(n > lastPrev) last = n;
	            continue;
	        }
	        lastPrev = last;
	        last = n;
	    }
	    
	    return c <= 1;
	}
}