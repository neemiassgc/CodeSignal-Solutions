fun candles(candlesNumber: Int, makeNew: Int): Int {
    var leftovers: Int = 0;
    var totalCandles: Int = 0;
    var candlesToBurn: Int = candlesNumber;
    
    while (candlesToBurn >= 1) {
        candlesToBurn--;
        leftovers++;
        totalCandles++;
        
        if (leftovers == makeNew) {
            candlesToBurn++;
            leftovers = 0;
        }
    }
    
    return totalCandles;
}