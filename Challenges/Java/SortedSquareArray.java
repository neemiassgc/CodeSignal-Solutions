final class SortedSquareArray {
	
	int[] sortedSquaredArray(int[] array) {
	    return Arrays.stream(array).map(n -> Math.abs(n) * Math.abs(n))
	    .sorted().toArray();
	}
}