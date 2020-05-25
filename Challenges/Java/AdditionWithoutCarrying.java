public final class AdditionWithoutCarrying {
	
	int additionWithoutCarrying(int a, int b) {
		int s = 0, t = 1;
	    
	    while(s < t) {
	        s += t * (a / t + b / t) % (t *= 10);
		}

	    return s;
	}
}