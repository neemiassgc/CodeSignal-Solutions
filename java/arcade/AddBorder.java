public final class AddBorder {

	String[] addBorder(String[] picture) {
		String b = "";
		int len = picture.length + 2;
		String[] r = new String[len];
		for(int i = 0; i < picture[0].length() + 2; i++) { b += "*"; }
		for(int i = 0, x = 0; i < len; i++) {
			if(i == 0 || i == len - 1) {
				r[i] = b;
				continue;
			}
			r[i] = "*"+picture[x]+"*";
			x++; 
		}
		return r;
	}
}
