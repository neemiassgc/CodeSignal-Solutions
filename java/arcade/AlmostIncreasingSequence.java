import java.util.List;
import java.util.ArrayList;

public class AlmostIncreasingSequence {
	boolean isIncreasing(List<Integer> l) {
	    int len = l.size();
	    for(int i = 1; i < len; i++) {
	        if(l.get(i) <= l.get(i - 1)) {
	            return false;
	        }
	    }
	    return true;
	}

	boolean almostIncreasingSequence(int[] sequence) {
	    int len = sequence.length;
	    List<Integer> list = new ArrayList<Integer>();
	    List<Integer> ll = new ArrayList<Integer>();
	    for(int i : sequence) {
	        list.add(Integer.valueOf(i));
	    }

	    for(int i = 0; i < len; i++) {
	        ll.addAll(list);
	        ll.remove(i);
	        if(isIncreasing(ll)) {
	            return true;
	        }
	        ll.clear();
	    }
	    return false;
	}
}