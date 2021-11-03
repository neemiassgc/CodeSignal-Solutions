import java.util.Set;
import java.util.HashSet;
import java.util.stream.Stream;

final class SquareDigitsSequence {
	
	int squareDigitsSequence(int a0) {
	    final Set<Integer> set = new HashSet<>();
	    
	    for (int elem = a0; set.add(elem); ) {
	        final int sum = Stream.of((elem+"").split(""))
	            .mapToInt(Integer::parseInt)
	            .map(n -> n * n).sum();
	            
	        elem = sum;
	    }
	    
	    return set.size() + 1;
	}
}