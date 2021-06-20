function candles(candlesNumber, makeNew) {
    let leftovers = 0;
    let totalCandles = 0;
    
    while (candlesNumber >= 1) {
        candlesNumber--;
        leftovers++
        totalCandles++;
        
        if (leftovers == makeNew) {
            candlesNumber++;
            leftovers = 0;
        }
    }
    
    return totalCandles;
}