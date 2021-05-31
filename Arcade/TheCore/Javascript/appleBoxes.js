function appleBoxes(k) {
    let yellowApples = 0;
    let redApples = 0;
    
    for (let n = 1; n <= k; n++) {
        if (n % 2 == 0) redApples += n * n;
        else yellowApples += n * n;
    }
    
    return redApples - yellowApples;
}