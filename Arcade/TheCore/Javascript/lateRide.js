function lateRide(n) {
    let sum = 0;
    
    for(let s of (Math.floor(n / 60)+""+(n % 60))) sum += parseInt(s);
    
    return sum;
}