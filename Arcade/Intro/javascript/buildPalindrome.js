function reverse(s) {
    let out = "";
    for(let i = s.length - 1; i >= 0; i--) out += s[i];
    return out;
}

function buildPalindrome(st) {
    if(reverse(st) === st) return st;
    
    let out = "", sg = "";
    for(let ch of st) {
        out = st+reverse(sg += ch);
        if(reverse(out) === out) break;
    }
    
    return out;
}