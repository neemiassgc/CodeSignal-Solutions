function depositProfit(deposit, rate, threshold) {
    for(let y = 1; ; y++) {
        if((deposit += rate / 100 * deposit) >= threshold) return y;
    }
}