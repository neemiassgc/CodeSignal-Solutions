fun isSumOfConsecutive2(n: Int): Int {
    var ways: Int = 0;
    
    outer@ for (i: Int in (1..n)) {
        var sum: Int = i;
        
        for (j: Int in ((i + 1)..n)) {
            sum += j;
            if (sum > n) continue@outer
            else if (sum == n) ways++;
        }
    }
    
    return ways;
}