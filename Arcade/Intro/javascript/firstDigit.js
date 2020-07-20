function firstDigit(inputString) {
    let out = '';
    for(let e of inputString) {
        if(/\d/.test(e)) {
            out = e;
            break;
        }
    }
    return out;
}