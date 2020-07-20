function digitDegree(n) {
    let counter = 0;
    
    for(let sum = 0; (n+"").length > 1; counter++, sum = 0) {
        for(let e of (n+"")) sum += parseInt(e);
        n = sum;
    }
    
    return counter;
}