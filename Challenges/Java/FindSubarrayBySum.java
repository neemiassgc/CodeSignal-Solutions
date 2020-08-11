final class FindSubarrayBySum {
	
	int[] findSubarrayBySum(int s, int[] arr) {
	    for(int i = 0; i < arr.length; i++) {
	        int sum = 0;
	        for(int j = i; j < arr.length; j++)
	            if((sum += arr[j]) == s) return new int[]{i + 1, j + 1};
	    }
	    
	    return new int[]{-1};
	}
}