final class MirrorBits {
	
	int mirrorBits(int a) {
	    return Integer.parseInt(
	    new StringBuilder(Integer.toBinaryString(a)).reverse().toString(), 2);
	}
}