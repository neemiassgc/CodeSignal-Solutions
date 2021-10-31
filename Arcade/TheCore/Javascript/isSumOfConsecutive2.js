function isSumOfConsecutive2(n) {
    let ways = 0;
    
    for (let i = 1; i <= n; i++) {
        let sum = i;
        
        for (let j = i + 1; j <= n; j++) {
            if ((sum += j) > n) break
            else if (sum == n) ways++
        }
    }
    
    return ways;
}