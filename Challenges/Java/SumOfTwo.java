final class SumOfTwo {

	boolean sumOfTwo(int[] a, int[] b, int v) {
	    Set<Integer> set = new HashSet<>();
	    for(int i : a) {
	        set.add(v - i < 0 ? (v - i) * -1 : v - i);
	    }
	    for(int i : b) {
	        if(set.contains(i)) {
	            return true;
	        }
	    }
	    return false;
	}
}