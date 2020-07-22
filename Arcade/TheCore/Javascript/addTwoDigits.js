function addTwoDigits(n) {
    let out = 0;
    
    for(let d of (n+"")) out += parseInt(d);
    
    return out;
}