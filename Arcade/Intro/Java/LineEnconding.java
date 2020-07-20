import java.util.List;
import java.util.ArrayList;

final class LineEnconding {

	String lineEncoding(String s) {
	    List<String> subs = new ArrayList<>();
	    String aux = "", out = "";
	    char prev = s.charAt(0);
	    
	    for(int i = 0; i < s.length(); i++) {
	        char curr = s.charAt(i);
	        if(curr != prev) {
	            subs.add(aux);
	            aux = (prev = curr)+"";
	            continue;
	        }
	        aux += prev = curr;
	    }
	    subs.add(aux);
	    
	    for(String v : subs) out += ""+(v.length() > 1 ? v.length() : "")+v.charAt(0);
	        
	    return out;
	}

}