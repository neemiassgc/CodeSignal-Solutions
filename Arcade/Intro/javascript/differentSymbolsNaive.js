function differentSymbolsNaive(s) {
    let set = [];
    for(let c of s) if(!set.includes(c)) set.push(c);
    return set.length;
}