import java.util.Arrays;

final class LongestWord {

	String longestWord(String text) {
	    return Arrays.stream(text.replaceAll("\\p{Punct}", " ").split(" "))
	    .reduce((v, c) -> c = v.length() > c.length() ? v : c).get();
	}
}