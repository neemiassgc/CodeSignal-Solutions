final class FirstReverseTry {
	
	int[] firstReverseTry(int[] arr) {
	    if (arr.length > 0) {
	        int tmp = arr[0];
	        arr[0] = arr[arr.length - 1];
	        arr[arr.length - 1] = tmp;
	    }
	    
	    return arr;
	}
}