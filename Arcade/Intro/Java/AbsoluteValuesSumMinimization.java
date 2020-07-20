import java.util.Arrays;
import java.util.stream.IntStream;

final class AbsoluteValuesSumMinimization {

	int absoluteValuesSumMinimization(int[] a) {
	    int[] sums = Arrays.stream(a).map(n -> Arrays.stream(a)
	        .map(e -> Math.abs(n - e)).sum()).toArray();
	    int min = Arrays.stream(sums).min().getAsInt();
	    return a[IntStream.range(0, sums.length)
	        .filter(i -> sums[i] == min).toArray()[0]];
	}
}