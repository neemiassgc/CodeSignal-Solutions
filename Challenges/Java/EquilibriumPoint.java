final class EquilibriumPoint {
	
	int equilibriumPoint(int[] a) {   
	    int before = 0, after = Arrays.stream(a).sum();

	    for(int i = 0; i < a.length; i++) {
	        before += i == 0 ? 0 : a[i - 1];
	        after = a[i] < 0 ? after + a[i] * -1 : after - a[i];
	        if(before == after) return i + 1;
	    }
	    
	    return -1;
	}
}