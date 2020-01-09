public final class ArrayMaxConsecutiveSum {

	int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    	int max = 0, len = inputArray.length;
    	for(int i = 0, sum = 0; i < len; i++, sum = 0) {
    		if(len - i + 1 > k) {
    			for(int j = 0; j < k; j++) {
    				sum += inputArray[i + j];
    			}
    			max = (sum > max) ? sum : max;
    		}
    	}
    	return max;
	}
}