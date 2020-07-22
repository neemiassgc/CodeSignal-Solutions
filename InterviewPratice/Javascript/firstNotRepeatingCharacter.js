const firstNotRepeatingCharacter = (s) => {
    let a = [];
    
    for(let i = 0; i < 26; i++) a.push(0);
    
    for(let e of s) a[e.charCodeAt(0) - 97]++;

    for(let e of s) if(a[e.charCodeAt(0) - 97] == 1) return e;
    
    return "_";
}