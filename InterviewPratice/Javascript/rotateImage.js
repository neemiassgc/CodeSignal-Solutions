const rotateImage = (a) => {
    let out = [];
    
    for(let i = 0; i < a.length; i++) out.push(new Array(a[0].length));
        
    for(let x = 0, i = a.length - 1; x < a[0].length; x++, i--) {
        for(let y = 0; y < a.length; y++) out[y][x] = a[i][y];
    }
    
    return out;
}