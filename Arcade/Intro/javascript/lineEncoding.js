function lineEncoding(s) {
    let subs = [], prev = s[0], aux = "";
    
    for(let i = 0; i < s.length; i++) {
        if(s[i] != prev) {
            subs.push(aux);
            aux = prev = s[i];
            continue;
        }
        aux += prev = s[i];
    }
    subs.push(aux);
    
    return subs.map(v => ""+(v.length > 1 ? v.length : "")+v.charAt(0)).join("");
}