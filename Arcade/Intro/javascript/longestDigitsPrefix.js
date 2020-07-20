function longestDigitsPrefix(inputString) {
    let output = "";
    
    for(let c of inputString) {
        if(/\d/.test(c)) output += c;
        else break;
    }
    
    return output;
}