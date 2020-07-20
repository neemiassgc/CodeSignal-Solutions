import java.util.Set;
import java.util.HashSet;

final class HappyNumber {

	boolean happyNumber(int n) {
	    Set<Integer> set = new HashSet<>();
	    
	    while(set.add(n)) {
	        int v = (n+"").chars().map(e -> new Integer(((char) e)+""))
	        .map(e -> e * e).sum();
	        
	        if(v == 1) return true;
	        else n = v;
	        
	    }
	    return false;
	}
}