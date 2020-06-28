final class RangeBitCount {

	int rangeBitCount(int a, int b) {
	    int counter = 0;

	    for(int i = a; i <= b; i++) {
	        for(char ch : Integer.toBinaryString(i).toCharArray()) {
	            if(ch == '1') counter++;
	        }
	    }

	    return counter;
	}
}