function commonCharacterCount(s1, s2) {
    let common = [], o = 0;
    for(let i = 0x61; i < 0x7b; i++) {
        let s = String.fromCharCode(i);
        if(s1.includes(s) && s2.includes(s)) common.push(s);
    }
    
    for(let e of common) {
        let p = 0, q = 0;
        for(let v of s1) if(v == e) p++;
        for(let v of s2) if(v == e) q++;
        o += Math.min(p, q);
    }
    
    return o;
}