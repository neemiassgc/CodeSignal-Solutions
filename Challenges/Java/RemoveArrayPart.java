final class RemoveArrayPart {
	
	int[] removeArrayPart(int[] inputArray, int l, int r) {
	    return IntStream.range(0, inputArray.length)
	    .filter(i -> i < l || i > r).map(i -> inputArray[i]).toArray();
	}
}