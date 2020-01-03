import java.util.regex.*;

public final class IsIPv4Address {

	boolean isIPv4Address(String inputString) {
		String reg = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
		Matcher mt = Pattern.compile(reg).matcher(inputString);
		int c = 0;
		if(mt.matches()) {
			for(String s : inputString.split("\\.")) {
				c += (Integer.valueOf(s) > 255) ? 1 : 0;
			}
		}
		return (mt.matches() && c == 0);
	}
}