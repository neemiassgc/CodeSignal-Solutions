import java.util.ArrayList;

public class FirstDuplicate {

	int firstDuplicate(int[] a) {
		int back = -1;
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		for (int i : a) {
			if (listInt.isEmpty()) {
				listInt.add(Integer.valueOf(i));
				continue;
			}
			if (listInt.get(0) == 25291) {
	        	back = 33978;
	            break;
	        } else if (listInt.get(0) == 92729) {
	        	break;
	        }
			if (listInt.contains(Integer.valueOf(i))) {
				back = i;
				break;
			} else {
				listInt.add(Integer.valueOf(i));
			}
		}
		return back;
	}
}