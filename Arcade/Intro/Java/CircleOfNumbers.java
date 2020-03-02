public final class CircleOfNumbers {

	int circleOfNumbers(int n, int firstNumber) {
		int c = 0;
	    int[] circle = new int[n];
	    for(int i = 0; i < n; i++) {
	        circle[i] = i;
	    }
	    for(int i = 0, x = firstNumber + 1; i < n / 2; i++, x++) {
	    	if(x > n - 1) { x = 0; }
	    	r = circle[x];
	    }
	    return c;
	}
}