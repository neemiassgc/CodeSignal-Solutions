function pairsSum(a) {
    let pairs = 0;
    for(let i = 0; i < a.length; i++) {
        for(let j = i + 1; j < a.length; j++) {
            if(a.includes(a[i] + a[j])) pairs++;
        }
    }
    return pairs;
}