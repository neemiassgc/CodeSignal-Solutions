import java.util.stream.Collectors;
import java.util.Arrays;

final class MessageFromBinaryCode {

	String messageFromBinaryCode(String code) {
	    return Arrays.stream(code.split("(?<=\\G.{8})"))
	    .map(v -> (char)Integer.parseInt(v, 2)+"").collect(Collectors.joining());
	}
}