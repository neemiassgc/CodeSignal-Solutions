function alphabeticShift(inputString) {
    let chars = [];
    for(let c of inputString) {
        chars.push(c === 'z' 
            ? 'a'
            : String.fromCharCode((c.charCodeAt(0) + 1)));
    }
    return chars.join("");
}