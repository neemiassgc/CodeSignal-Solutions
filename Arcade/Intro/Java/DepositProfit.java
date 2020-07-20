final class DepositProfit {

	int depositProfit(int deposit, int rate, int threshold) {
	    float d = deposit;
	    for(int y = 1;; y++) if((d += rate / 100f * d) >= threshold) return y;
	}
}