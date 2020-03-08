final class LateRide {

	String timeConverter(int n) {
	    int h = 0, m = 0;
	    for(int i = 0; i < n; i++) {
	        m++;
	        if(m == 60) {
	            h++;
	            m = 0;
	        }
	    }
	    return (h < 9 ? "0"+h : h)+""+(m < 9 ? "0"+m : m);
	}

	int lateRide(int n) {
	    int sum = 0;
	    for(char ch : timeConverter(n).toCharArray()) {
	        sum += new Integer(ch+"");
	    }
	    return sum;
	}
}