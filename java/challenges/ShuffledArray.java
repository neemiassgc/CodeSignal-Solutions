import java.util.ArrayList;
import java.util.Arrays;

public final class ShuffledArray {

	int[] shuffledArray(int[] shuffled) {
	    ArrayList<Integer> list = new ArrayList();
	    int out = 0, len = shuffled.length, sum = 0;
	    int[] res = new int[len - 1];
	    for(int i : shuffled) { list.add(i); }
	    for(int i = 0; i < len; i++, sum = 0) {
	        for(int j = 0; j < len; j++) {
	            if(j != i) { sum += list.get(j); }
	        }
	        if(list.contains(sum)) {
	            out = sum;
	            break;
	        }
	    }
	    list.remove(new Integer(out));
	    for(int i = 0; i < list.size(); i++) { res[i] = list.get(i); }
	    Arrays.sort(res);
	    return res;
	}
}