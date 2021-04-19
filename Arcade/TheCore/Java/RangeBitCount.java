import java.util.stream.IntStream;

final class RangeBitCount {
	
	int rangeBitCount(int a, int b) {
	    return IntStream.range(a, b + 1)
	        .reduce(
	            0,
	            (t, i) -> t + Integer.toString(i, 2)
	            	.replaceAll("0", "").length()
	        );
	}
}