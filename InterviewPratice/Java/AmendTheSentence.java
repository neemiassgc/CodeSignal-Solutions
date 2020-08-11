final class AmendTheSenteance {

   String amendTheSentence(String s) {
	    return Arrays.stream(s.split("(?=[A-Z])"))
	    .collect(Collectors.joining(" ")).toLowerCase();
	}
}