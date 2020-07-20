function deleteDigit(n) {
    let max = 0, idx = [], s = (n+"");
    
    for(let i = 0; i < s.length; i++) idx.push(i);
    for(let i = 0; i < s.length; i++) {
        let v = parseInt(idx.filter(j => j != i).map(j => s[j]).join(""));
        if(v > max) max = v;
    }
    
    return max;
}