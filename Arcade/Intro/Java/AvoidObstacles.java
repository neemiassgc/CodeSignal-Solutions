final class AvoidObstacles {

	int avoidObstacles(int[] inputArray) {
	    boolean k = true;
	    for(int i = 2; ; i++) {
	        for(int j : inputArray) {
	            if(j % i == 0) {
	                k = !k;
	                break;
	            }
	        }
	        if(k) return i;
	        k = true;
	    }
	}
}