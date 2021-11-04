function s(n) {
    return [...n+""].map(i => +i).reduce((t, a) => t + a)
}

function comfortableNumbers(l, r) {
    let pairs = 0;

    for (let i = l; i < r; i++)
        for (let j = i + 1; j <= r; j++)
            if (i >= j - s(j) && i <= j + s(j)
                && j >= i - s(i) && j <= i + s(i)) pairs++;
    
    return pairs;
}