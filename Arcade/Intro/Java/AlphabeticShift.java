import java.util.stream.Collectors;

final class AlphabeticShift {

	String alphabeticShift(String inputString) {
	    return inputString.chars().boxed()
	        .map(c -> c == 122 ? 'a' : (char)(c + 1))
	        .map(Object::toString)
	        .collect(Collectors.joining());
	}
}