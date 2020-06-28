function sortByString(s, t) {
    let out = "";
    
    for(let o of t) {
        while(s.includes(o)) {
            s = s.replace(o, "");
            out += o;
        }
    }
    
    return out;
}