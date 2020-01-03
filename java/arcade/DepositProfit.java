public final class DepositProfit {

	int depositProfit(int deposit, int rate, int threshold) {
	    float d = deposit;
	    for(int y = 1;; y++) {
	        d += d / 100f * rate;
	        if(d >= threshold) { return y; }
	    }
	}
}