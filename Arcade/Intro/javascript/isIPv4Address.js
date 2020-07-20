function isIPv4Address(inputString) {
    let split = inputString.split(".");
    
    if(split.length != 4) return false;
    
    for(let o of split) {
        let e = o.match("\d*[a-z]+\d*");
        if(e != null) if(e[0].length > 0) return false;
        
        if(o.length == 0) return false;
        
        if(o.length > 1 && (o.charAt(0) == '0' || parseInt(o) > 255))
            return false;
    }
    return true;
}