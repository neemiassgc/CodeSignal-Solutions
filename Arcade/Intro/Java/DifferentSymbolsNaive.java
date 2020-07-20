final class DifferentSymbolsNaive {

	int differentSymbolsNaive(String s) {
	    return s.chars().distinct().toArray().length;
	}

}