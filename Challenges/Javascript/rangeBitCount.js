function rangeBitCount(a, b) {
    c = 0;
    for(let i = a; i <= b; i++) {
        for(let o of i.toString(2).split(/(?=.)/)) c += parseInt(o);
    }    
    return c;
}