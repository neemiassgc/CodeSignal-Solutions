public final class ComposeRanges {

	String[] composeRanges(int[] n) {
	    List<List<Integer>> set = new ArrayList<>();
	    List<Integer> ran = new ArrayList<>();
	    String[] out = null;
	    int l = 0;

	    for(int i = 0; i < n.length - 1; i++) {
	        if(i == 0) ran.add(n[i]);
	        if(n[i + 1] - n[i] == 1 || n[i + 1] - n[i] == 0) {
	            ran.add(n[i + 1]);
	        }
	        else {
	            set.add(ran);
	            ran = new ArrayList<>();
	            ran.add(n[i + 1]);
	        }
	        if(i == n.length - 2) set.add(ran);
	    }

	    l = set.size();
	    out = new String[l];
	    for(int i = 0; i < l; i++) {
	        ran = set.get(i);
	        out[i] = ran.size() > 1 ?
	            ran.get(0)+"->"+ran.get(ran.size() - 1) :
	            ran.get(0)+"";
	    } 

	    return out;
	}
}