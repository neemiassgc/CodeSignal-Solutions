function reverseString(str) {
    let o = "";
    for(let i = str.length - 1; i >= 0; i--) o += str.charAt(i);
    return o;
}

function reverseInParentheses(inputString) {
    let reg = /\(\w*\)/;
    if(!reg.test(inputString)) return inputString;
    let str = reg.exec(inputString)[0],
        revStr = reverseString(str.substr(1, str.length - 2));
    return reverseInParentheses(inputString.replace(str, revStr));
}