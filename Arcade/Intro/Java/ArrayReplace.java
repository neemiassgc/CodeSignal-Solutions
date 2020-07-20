import java.util.Arrays;

final class ArrayReplace {

	int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
	    return Arrays.stream(inputArray)
	    .map(n -> n == elemToReplace ? substitutionElem : n).toArray();
	}
}