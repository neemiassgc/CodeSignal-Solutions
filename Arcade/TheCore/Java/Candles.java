final class Candles {
    
    int candles(int candlesNumber, int makeNew) {
        int leftovers = 0, totalCandles = 0;
        
        while (candlesNumber >= 1) {
            candlesNumber--;
            leftovers++;
            totalCandles++;
            
            if (leftovers == makeNew) {
                candlesNumber++;
                leftovers = 0;
            }
        }
        
        return totalCandles;
    }
}