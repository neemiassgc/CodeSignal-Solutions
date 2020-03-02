const firstNotRepeatingCharacter = (s) => {
    let counter = [];
    for(let i = 0; i < 26; i++) { counter.push(0); }
    for(let i in s) { counter[s.charCodeAt(i) - 97]++; }
    for(let i in s) {
        if(counter[s.charCodeAt(i) - 97] == 1) {
            return s.charAt(i);
        }
    }
    return "_";
}