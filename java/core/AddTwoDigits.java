final class AddTwoDigits {

	int addTwoDigits(int n) {
	    int sum = 0;
	    for(char c : (n+"").toCharArray()) {
	        sum += new Integer(c+"");
	    }
	    return sum;
	}
}