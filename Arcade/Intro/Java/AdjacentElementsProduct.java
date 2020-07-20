import java.util.stream.IntStream;

final class AdjacentElementsProduct {
	
	int adjacentElementsProduct(int[] inputArray) {
	    return IntStream.range(1, inputArray.length)
        .map(n -> inputArray[n] * inputArray[n - 1])
        .max()
        .getAsInt();
	}
}