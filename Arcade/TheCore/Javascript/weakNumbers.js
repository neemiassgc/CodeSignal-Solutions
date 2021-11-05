function divisors(n) {
    let d = 0;

    for (let i = 1; i <= n; i++)
        if (n % i == 0) d++;
    
    return d;
}

function weakness(n) {
    let lvl = 0;
    const d = divisors(n);
    
    for (let i = 1; i < n; i++)
        if (divisors(i) > d) lvl++;
        
    return lvl;
}

function weakNumbers(n) {
    const weaknessSet = []
    
    for (let i = 1; i <= n; i++) weaknessSet.push(weakness(i))
    
    const weakestNumber =
        weaknessSet.reduce((prev, acc) => prev < acc ? acc : prev);
    
    return [
        weakestNumber,
        weaknessSet.filter(i => i == weakestNumber).length
    ]
}