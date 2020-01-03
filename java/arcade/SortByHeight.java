import java.util.ArrayList;
import java.util.Arrays;

public class SortByHeight {
	
	int[] sortByHeight(int[] a) {
		ArrayList<Integer> values = new ArrayList();
		ArrayList<Integer> tress = new ArrayList();
		for(int i = 0; i < a.length; i++) {
			if(a[i] == -1) { tress.add(i); }
		}
		Arrays.sort(a);
		for(int i : a) {
			if(i != -1) { values.add(i); }
		}
		for(int i : tress) {
			values.add(i, -1);
		}
		int[] res = new int[values.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = values.get(i);
		}
		return res;
	}
}