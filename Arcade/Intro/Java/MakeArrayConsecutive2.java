import java.util.Arrays;
import java.util.stream.IntStream;

final class MakeArrayConsecutive2 {

	int makeArrayConsecutive2(int[] statues) {
	    Arrays.sort(statues);
	    return IntStream.rangeClosed(statues[0], statues[statues.length - 1])
	        .toArray().length - statues.length;
	}
}