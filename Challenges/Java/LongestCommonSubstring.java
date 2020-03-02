import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class LongestCommonSubstring {

    int longestCommonSubstring(String s, String t) {
        int out = 0;
        Matcher mt = null;
        for(int x = 1, y = 0; x <= t.length(); x++) {
            String z = t.substring(y, x);
            mt = Pattern.compile(z).matcher(s);
            if(mt.find()) {
                int c = mt.group().length();
                out = (c > out) ? c : out;
                System.out.println(z);
                continue;
            }
            y = (out > 1) ? x - 1 : x;
            
        }
        return out;
    }


    public static void main(String[] args) {
        String s = "abcdxyz";
        String t = "xyzabcd";
        int res = new LongestCommonSubstring().longestCommonSubstring(s, t);
        System.out.println(res); // it shows 4
    }   
}