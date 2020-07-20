function happyNumber(n) {
    let set = [];
    while(!set.includes(n)) {
        let sum = 0;
        set.push(n);
        
        for(let e of n+"") sum += parseInt(e) ** 2;
        
        if(sum == 1) return true;
        else n = sum;
    }
    
    return false;
}