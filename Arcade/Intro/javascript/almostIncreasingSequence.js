function almostIncreasingSequence(sequence) {
    let l = -0x186a0, lp = -0x186a0, c = 0;
    
    for(let e of sequence) {
        if(e <= l) {
            c++;
            if(e > lp) l = e;
            continue;
        }
        lp = l;
        l = e;
    }
    
    return c <= 1;
}