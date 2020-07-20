import java.util.Arrays;

public class AllLongestStrings {

	String[] allLongestStrings(String[] inputArray) {
	    int max = Arrays
	        .stream(inputArray)
	        .mapToInt(n -> n.length())
	        .max()
	        .getAsInt();
	    Object[] obj = Arrays
	        .stream(inputArray)
	        .filter(s -> s.length() == max)
	        .toArray();
	    return Arrays.asList(obj).toArray(new String[obj.length]);
	}
}