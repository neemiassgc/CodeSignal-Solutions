function rangeBitCount(a, b) {
    let count = 0;
    
    for (let i = a; i <= b; i++)
        count += i.toString(2).replaceAll("0", "").length
    
    return count;
}