import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class ReverseInParentheses {

    String reverseInParentheses(String inputString) {
        Pattern ptt = Pattern.compile("\\(\\w*\\)");
        Matcher mtc = ptt.matcher(inputString);
        if(!mtc.find()){ return inputString; }
        else {
            String s = mtc.group(), ss = null;
            ss = s.replace("(", "");
            ss = ss.replace(")", "");
            ss = new StringBuilder(ss).reverse().toString();
            return reverseInParentheses(inputString.replace(s, ss));
        }
    }
}