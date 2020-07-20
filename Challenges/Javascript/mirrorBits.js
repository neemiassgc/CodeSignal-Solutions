function reverseString(s) {
    let out = "";
    for(let i = s.length - 1; i >= 0; i--) out += s[i];
    return out;
}

function mirrorBits(a) {
    return parseInt(reverseString((a).toString(2)), 2);
}