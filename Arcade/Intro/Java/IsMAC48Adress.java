import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class IsMAC48Adress {

	boolean isMAC48Address(String inputString) {
	    String reg = "[0-9A-F]{2}(-[0-9A-F]{2}){5}";
	    Pattern pattern = Pattern.compile(reg);
	    return pattern.matcher(inputString).matches();
	}
}