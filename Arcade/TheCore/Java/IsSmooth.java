final class IsSmooth {
	
	boolean isSmooth(int[] arr) {
	    int l = arr.length;
	    
	    if (l == 1) return true;
	    
	    int middle = switch (l % 2) {
	        case 0 -> arr[l / 2] + arr[l / 2 - 1];
	        default -> arr[l / 2];
	    };
	    
	    return arr[0] == middle && arr[l - 1] == middle;
	}
}