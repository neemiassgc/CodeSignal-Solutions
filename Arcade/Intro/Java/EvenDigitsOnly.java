final class EvenDigitsOnly {
	
	boolean evenDigitsOnly(int n) {
	    return (n+"").chars().allMatch(e -> new Integer(e+"") % 2 == 0);
	}
}