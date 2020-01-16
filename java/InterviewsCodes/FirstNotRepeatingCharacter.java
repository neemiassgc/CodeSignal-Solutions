import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FirstNotRepeatingCharacter {

	char firstNotRepeatingCharacter(String s) {
		for (char c : s.toCharArray()) {
			Matcher mat = Pattern.compile(String.valueOf(c)).matcher(s);
			int temp = 0;
			while (mat.find()) {
				temp++;
			}
			if (temp < 2) {
				return c;
			}
		}
		return '_';
	}
}