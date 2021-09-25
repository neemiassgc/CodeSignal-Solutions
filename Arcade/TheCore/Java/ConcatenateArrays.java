final class ConcatenateArrays {
	
	int[] concatenateArrays(int[] a, int[] b) {
	    return IntStream.concat(IntStream.of(a), IntStream.of(b)).toArray();
	}
}