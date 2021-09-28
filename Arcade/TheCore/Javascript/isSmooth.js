function isSmooth(arr) {
    const l = arr.length
    
    if (l == 1) return true
    
    let middle
    
    if (l % 2 == 0) middle = arr[l / 2] + arr[l / 2 - 1]
    else middle = arr[Math.floor(l / 2)]
    
    return arr[0] == middle && arr[l - 1] == middle
}