public final class DigitDegree {

	int digitDegree(int n) {
		int g = 0, t = 0;
		String s = n+"";
		while(s.length() > 1) {
			t = 0;
			for(char c : s.toCharArray()) { t += Integer.valueOf(c+"").intValue(); }
			s = t+"";
			g++;
		}
		return g;
	}
}