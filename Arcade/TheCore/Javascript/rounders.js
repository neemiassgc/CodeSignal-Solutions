function rounders(n) {
    const digits = [...n+""].map(i => parseInt(i))
    
    for (let i = digits.length - 1; i >= 1; i--) {
        if (digits[i] >= 5) digits[i - 1]++;
        digits[i] = 0;
    }
    
    return parseInt(digits.join(""));
}