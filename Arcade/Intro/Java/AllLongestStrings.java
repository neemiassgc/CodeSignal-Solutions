import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class AllLongestStrings {

	String[] allLongestStrings(String[] inputArray) {
		int c = 0;
	    for(int i = 0; i < inputArray.length; i++) {
	        int len = inputArray[i].length();
	        if(len > c) { c = len; }
	    }
	    List<String> list = new ArrayList<String>();
	    for(String s : inputArray) {
	        if(s.length() == c) { list.add(s); }
	    }
	   	String[] out = new String[list.size()];
   		return list.toArray(out);
	}
}