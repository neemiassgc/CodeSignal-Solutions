import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ClassifyStrings {

    String check(String s) {
        Pattern reg = Pattern.compile("[aeiou]{3}|[^aeiou]{5}");
        return (reg.matcher(s).find() ? "bad" : "good");
    }

    String classifyStrings(String s) {
        String res = "";
        if(!s.contains("?")) { res = check(s); }
        else {
            String s1 = check(s.replace("?", "a"));
            String s2 = check(s.replace("?", "n"));
            if(s.length() > 4 && s.contains("???")) { res = "mixed"; }
            else if(s1.equals("bad") && s2.equals("bad")) { res = "bad"; }
            else if(s1.equals("good") && s2.equals("good")) { res = "good"; }
            else { res = "mixed"; }
        }
        return res;
    }
}