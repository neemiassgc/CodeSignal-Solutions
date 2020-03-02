public final class ArrayMaximalAdjacentDifference {
	
	int arrayMaximalAdjacentDifference(int[] inputArray) {
		int m = 0;
		for(int i = 0; i < inputArray.length - 1; i++) {
		    int s = Math.abs(inputArray[i + 1] - inputArray[i]);
		    m = (s > m) ? s : m;
		}
		return m;
	}
}