function phoneCall(min1, min2_10, min11, s) {
    let min = 0, q = 9;
        
    if(s >= min1) {
        s -= min1;
        min++;
    }
    
    for(let i = 0; i < 9; i++) {
        if(s >= min2_10) {
            s -= min2_10;
            min++;
            q--;
        }
    }
    
    if(q == 0) {
        while(s >= min11) {
            s -= min11;
            min++;
        }   
    }
    
    return min;
}