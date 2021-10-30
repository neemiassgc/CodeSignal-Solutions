final class IsPower {
    
    boolean isPower(int n) {
        if (n == 1) return true;
        
        for (int p = 2; p < n; p++) {
            for (int q = 2; q < n; q++) {
                if (Math.pow(p, q) > n) break;
                if (Math.pow(p, q) == n) return true;
            }
        }
        
        return false;
    }
}