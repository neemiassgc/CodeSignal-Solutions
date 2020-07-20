final class AddBorder {

	String[] addBorder(String[] picture) {
	    int len = picture.length + 2;
	    String[] o = new String[len];
	    
	    for(int i = 0; i < len - 2; i++) {
	        o[i + 1] = "*"+picture[i]+"*";
	    }
	    
	    o[0] = o[len - 1] = "*".repeat(picture[0].length() + 2);
	    
	    return o;
	}
}
