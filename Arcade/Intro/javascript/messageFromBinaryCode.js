function messageFromBinaryCode(code) {
    return code.match(/.{8}/g)
    .map(e => String.fromCharCode(parseInt(e, 2))).join("");
}