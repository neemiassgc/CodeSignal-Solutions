import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class SumUpNumbers {

	int sumUpNumbers(String inputString) {
	    int sum = 0;
	    Pattern ptt = Pattern.compile("[0-9]+");
	    Matcher mtc = ptt.matcher(inputString);
	    while(mtc.find()) { sum += Integer.valueOf(mtc.group()).intValue(); }
	    return sum;
	}
}