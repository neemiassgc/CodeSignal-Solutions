final class MirrorBits {
	
	int mirrorBits(int a) {
	    return Integer.parseInt(
	        new StringBuilder(Integer.toString(a, 2)).reverse()+"", 2
	    );
	}
}