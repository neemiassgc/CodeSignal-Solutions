import java.util.stream.IntStream;

final class ArrayMaximalAdjacentDifference {
	
	int arrayMaximalAdjacentDifference(int[] inputArray) {    
	    return IntStream.range(0, inputArray.length - 1)
	    .map(i -> Math.abs(inputArray[i] - inputArray[i + 1])).max().getAsInt();
	}
}