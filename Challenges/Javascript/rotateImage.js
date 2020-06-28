function rotateImage(a) {
    let h = a.length, w = a[0].length, out = [];
    
    for(let i = 0, r = []; i < h; i++, r = []) {
        for(let j = w - 1; j >= 0; j--) r.push(a[j][i]);
        out.push(r);
    }
    
    return out;
}