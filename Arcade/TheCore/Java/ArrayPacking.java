final class ArrayPacking {
	
	int arrayPacking(int[] a) {
	    String bits = "";
	    
	    for(int i = a.length - 1; i >= 0; i--) {
	        String _bin = Integer.toString(a[i], 2);
	        bits += "0".repeat(8 - _bin.length()) + _bin;
	    }
	        
	    return Integer.parseInt(bits, 2);
	}
}