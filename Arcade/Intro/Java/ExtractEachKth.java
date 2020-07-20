import java.util.stream.IntStream;

public final class ExtractEachKth {

	int[] extractEachKth(int[] inputArray, int k) {
	    return IntStream.range(0, inputArray.length)
	    .filter(i -> (i + 1) % k != 0).map(i -> inputArray[i]).toArray();
	}
}