function missingNumber(arr) {
    let out = 0;
    for(let i = 0; i <= arr.length; i++) {
        if(!arr.includes(i)) {
            out = i;
            break;
        }
    }
    return out;
}