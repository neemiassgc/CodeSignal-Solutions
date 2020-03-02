final class AlternatingSums {

	int[] alternatingSums(int[] a) {
		int[] t = new int[2];
		boolean b = true;
		for(int i : a){
			t[b ? 0 : 1] += i;
			b = !b;
		}
		return t;
	}
}	
