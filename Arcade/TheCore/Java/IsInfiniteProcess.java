final class IsInfiniteProcess {
	
	boolean isInfiniteProcess(int a, int b) {
	    return !((a < b && (int) Math.abs(a - b) % 2 == 0) || a == b);
	}
}