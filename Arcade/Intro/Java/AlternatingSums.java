final class AlternatingSums {

	int[] alternatingSums(int[] a) {
		int[] o = new int[2];
	    for(int i = 0; i < a.length; i++) {
	        o[(i + 1) % 2 == 0 ? 1 : 0] += a[i];
	    }
	    return o;
	}
}	
