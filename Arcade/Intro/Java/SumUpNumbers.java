final class SumUpNumbers {

	int sumUpNumbers(String inputString) {    
	    return Arrays.stream(inputString.replaceAll("[^\\d]", " ").split(" "))
	    .mapToInt(e -> !e.isEmpty() ? Integer.parseInt(e) : 0).sum();
	}
}