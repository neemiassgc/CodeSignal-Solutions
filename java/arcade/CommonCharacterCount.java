public class CommonCharacterCount {
	
	int commonCharacterCount(String s1, String s2) {
		String ss1 = "", ss2 = "", chs = "";
		int cnt = 0;
		for(char c : s1.toCharArray()) {
			ss1 += (!ss1.contains(""+c)) ? ""+c : "";
		}
		for(char c : s2.toCharArray()) {
			ss2 += (!ss2.contains(""+c)) ? ""+c : "";
		}
		for(char c : ss1.toCharArray()) {
			chs += (ss2.contains(""+c)) ? ""+c : "";
		}
		for(char c : chs.toCharArray()) {
			int c1 = 0, c2 = 0;
			for(char cc : s1.toCharArray()) {
				c1 += (cc == c) ? 1 : 0;
			}
			for(char cc : s2.toCharArray()) {
				c2 += (cc == c) ? 1 : 0;
			}
			cnt += (c1 < c2) ? c1 : c2;
		}
		return cnt;
	}
}