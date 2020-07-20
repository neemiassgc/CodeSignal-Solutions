function spiralNumbers(n) {
    let spiral = [];
    let left = 0, right = n - 1, top = 0, down = n - 1;
    
    for(let i = 0; i < n; i++) {
        let aux = [];
        for(let j = 0; j < n; j++) aux.push(0);
        spiral.push(aux);
    }
    
    for(let adder = 1; adder <= n * n; ) {
        for(let x = left; x <= right; x++) spiral[top][x] = adder++;
        top++;
        
        for(let y = top; y <= down; y++) spiral[y][right] = adder++;
        right--;
        
        for(let x = right; x >= left; x--) spiral[down][x] = adder++;
        down--;
        
        for(let y = down; y >= top; y--) spiral[y][left] = adder++;
        left++;
    }
    
    return spiral;
}