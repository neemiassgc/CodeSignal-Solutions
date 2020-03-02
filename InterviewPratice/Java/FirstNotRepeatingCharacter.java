import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FirstNotRepeatingCharacter {

	char firstNotRepeatingCharacter(String s) {
		int c = 0;
		String t = "";
		for(byte b = 97; b <= 122; b++) {
			Matcher m = Pattern.compile((char)b+"").matcher(s);
			if(m.find()) {
				m = m.reset();
				while(m.find()) { c++; }
				if(c < 2) { t += (char)b; }
			}
			c = 0;
		}
		for(char ch : s.toCharArray()) {
			if(t.contains(ch+"")) { return ch; }
		}
		return '_';
	}
}