final class Rounders {
	
	int rounders(int n) {
	    int[] digits = (n+"").chars()
	        .map(c -> Integer.parseInt(((char) c)+"")).toArray();
	    
	    for (int i = digits.length - 1; i >= 1; i--) {
	        if (digits[i] >= 5) digits[i - 1]++;
	        digits[i] = 0;
	    }
	    
	    return Integer.parseInt(Arrays.toString(digits).replaceAll("\\D", ""));
	}
}