function isPower(n) {
    if (n == 1) return true;
    
    for (let m = 2; m <= n; m++) {
        
        for (let e = 2; e <= n; e++) {
            if (Math.pow(m, e) > n) break;
            if (Math.pow(m, e) == n) return true;
        }
    }
    
    return false
}