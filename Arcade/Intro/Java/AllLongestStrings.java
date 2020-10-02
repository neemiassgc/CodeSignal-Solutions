import java.util.Arrays;

public class AllLongestStrings {

	String[] allLongestStrings(String[] inputArray) {
	    int max = Stream.<String>of(inputArray)
		.mapToInt(n -> n.length())
		.max()
		.getAsInt();
		
	    return Stream.<String>of(inputArray)
		.filter(e -> e.length() == max)
		.toArray(String[]::new);
	}
}
