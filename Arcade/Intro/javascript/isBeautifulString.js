function isBeautifulString(inputString) {
    let abc = []
    for(let i = 0; i < 26; i++) abc.push(0);
    for(let c of inputString) abc[c.codePointAt(0) - 97]++;
    for(let i = 0; i < 25; i++) if(abc[i + 1] > abc[i]) return false;
    return true;
}