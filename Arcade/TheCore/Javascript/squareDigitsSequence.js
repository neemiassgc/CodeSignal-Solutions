function squareDigitsSequence(a0) {
    const seq = [a0]
    
    while (true) {
        const sum = [...seq[0]+""]
            .map(i => Math.pow(+i, 2))
            .reduce((total, curr) => total + curr);
            
        if (seq.includes(sum)) break;
        
        seq.unshift(sum);
    }
    
    return seq.length + 1;
}