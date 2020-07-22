function isCryptSolution(crypt, solution) {
    for(let i = 0; i < 3; i++) {
        for(let c of solution)
            crypt[i] = crypt[i].replace(new RegExp(c[0], "g"), c[1]);
    }
    
    for(let s of crypt) if(/^0+\d+/g.test(s)) return false;
    
    return parseInt(crypt[0]) + parseInt(crypt[1]) == parseInt(crypt[2]);
}