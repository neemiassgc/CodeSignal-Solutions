final class FirstDigit {

	char firstDigit(String inputString) {
	    return (char) inputString.chars()
	    .filter(e -> ((char)e+"").matches("\\d")).toArray()[0];
	}
}