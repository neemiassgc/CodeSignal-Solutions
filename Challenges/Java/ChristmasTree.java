final class ChristmasTree {

	String[] christmasTree(int ln, int lh) {
	    Vector<String> tree = new Vector<>(ln * lh + ln + 3);
	    String line = "", blank = "";

	    // tree's crown
	    for(int i = 0, p = ln + lh; i < 3; i++) {
	        for(int j = 0; j < p - 1; j++) blank += " ";
	        tree.add(i != 2 ? blank+" "+"*" : blank+"***");
	        blank = "";
	    }
	    
	    // tree's body
	    for(int i = 0, p = 5, n = lh + ln - 2; i < ln; i++, p += 2, n--) {
	        for(int j = 0, q = p, m = n; j < lh; j++, q += 2, m--) {
	            for(int w = 0; w < q; w++) line += "*";
	            for(int w = 0; w < m; w++) blank += " ";
	            
	            tree.add(blank+line);
	            line = blank = "";
	        }
	    }
	    
	    // tree's foot
	    for(int i = 0,
	    p = (tree.get(tree.size() - 1).length() - lh) / 2;
	    i < ln; i++) {
	        for(int w = 0; w < lh; w++) line += "*";
	        for(int w = 0; w < p; w++) blank += " ";
	        
	        tree.add(blank+(lh % 2 == 0 ? line+"*": line));
	        line = blank = "";
	    }
	    
	    return tree.toArray(new String[tree.size()]);
	}
}