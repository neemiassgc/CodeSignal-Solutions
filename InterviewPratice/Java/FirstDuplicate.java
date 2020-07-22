import java.util.Set;
import java.util.HashSet;

final class FirstDuplicate {

	int firstDuplicate(int[] a) {
	    Set<Integer> set = new HashSet<>();
	    
	    for(int i : a) if(!set.add(i)) return i;
	    
	    return -1;
	}
}