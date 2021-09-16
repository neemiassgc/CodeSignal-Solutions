function firstReverseTry(arr) {
    Array.prototype.swp = function(i, j) {
        const tmp = this[i]
        this[i] = this[j]
        this[j] = tmp
    };
    
    if (arr.length > 0) arr.swp(0, arr.length - 1)
    
    return arr
}