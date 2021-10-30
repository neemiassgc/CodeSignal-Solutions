fun isPower(n: Int): Boolean {
    if (n == 1) return true;
    
    outer@ for (i: Int in (2..n)) {
        for(j: Int in (2..n)) {
            val q: Int = Math.pow(i.toDouble(), j.toDouble()).toInt();
            if (q > n) continue@outer
            if (q == n) return true
        }
    }
    
    return false;
}