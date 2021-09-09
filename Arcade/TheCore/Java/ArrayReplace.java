import java.util.stream.IntStream;

final class ArrayReplace {
	
	int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
	    return IntStream.of(inputArray)
	        .map(i -> i == elemToReplace ? substitutionElem : i)
	        .toArray();
	}
}