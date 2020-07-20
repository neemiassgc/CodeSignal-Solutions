final class ArrayMaxConsecutiveSum {

	int arrayMaxConsecutiveSum(int[] inputArray, int k) {
       int max = 0, t = 0;
       
       for(int i = 0; i <= inputArray.length - k; i++, t = 0) {
           for(int j = i; j < i + k; j++) t += inputArray[j];
           if(t > max) max = t;
       }
       
       return max;
    }
}