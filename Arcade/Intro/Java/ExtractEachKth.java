import java.util.ArrayList;

public final class ExtractEachKth {

	int[] extractEachKth(int[] inputArray, int k) {
		ArrayList<Integer> list = new ArrayList();
		for(int i = 1; i <= inputArray.length; i++) {
			if(i % k != 0) { list.add(inputArray[i - 1]); }
		}
		int[] ret = new int[list.size()];
		for(int i = 0; i < ret.length; i++) { ret[i] = list.get(i); }
		return ret;
	}
}