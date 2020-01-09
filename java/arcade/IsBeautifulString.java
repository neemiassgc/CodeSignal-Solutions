import java.util.ArrayList;

public final class IsBeautifulString {

	boolean isBeautifulString(String inputString) {
		ArrayList<Integer> list = new ArrayList();
		int[] alpha = new int[26];
		for(char ch : inputString.toCharArray()) {
			int i = (int)ch;
			if(!inputString.contains((char)(i - 1)+"") && i != 97) { return false; }
			alpha[i - 97]++;
		}
		for(int i : alpha) { if(i != 0) { list.add(i); } }
		for(int i = 0; i < list.size() - 1; i++) {
			if(list.get(i) < list.get(i + 1)) { return false; }
		}
		return true;
	}
}