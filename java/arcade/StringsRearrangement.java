import java.util.Arrays;
import java.util.ArrayList;

public final class StringsRearrangement {

	boolean differByOneChar(String str1, String str2) {
	    int len = str1.length();
	    for(int i = 0; i < len; i++) {
	        for(int j = 0; j < len; j++) {
	            String s1 = "";
	            for(int a = 0; a < len; a++) {
	                s1 += (a != j) ? str1.charAt(a) : str2.charAt(i);
	            }
	            if(s1.equals(str2)) { return true; }
	        }
	    }
	    return false;
	}

	boolean stringsRearrangement(String[] inputArray) {
	    ArrayList<String> list = new ArrayList();
	    for(String s : inputArray) {
	        if(!list.contains(s)) { list.add(s); }
	    }
	    String[] array = list.toArray(new String[list.size()]);
	    Arrays.sort(array);
	    if(array.length == 1) { return false; }
	    for(int i = 0; i < array.length - 1; i++) {
	        if(!differByOneChar(array[i], array[i+1])) {
	            return false;
	        }
	    }
	    return true;
	}
}