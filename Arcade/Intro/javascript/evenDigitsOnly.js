function evenDigitsOnly(n) {
    let nums = [];
    for(let o of n+"") nums.push(o);
    return nums.every(v => v % 2 == 0);    
}