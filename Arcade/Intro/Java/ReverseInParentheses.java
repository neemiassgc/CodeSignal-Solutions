import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class ReverseInParentheses {

    String reverseInParentheses(String inputString) {
        Matcher mt = Pattern.compile("\\(\\w*\\)").matcher(inputString);
        if(!mt.find()) return inputString;
        String str = mt.group(),
            revStr = str.replace(")", "").replace("(", "");
        return reverseInParentheses(inputString.replace(str,
            new StringBuilder(revStr).reverse().toString()));
    }
}