const rotateImage = (a) => {
    let out = [];
    for(let x = 0; x < a[0].length; x++) {
        let tmp = [];
        for(let y = 0; y < a.length; y++) {
            tmp.push(a[y][x]);
        }
        out.push(tmp.reverse());
    }
    return out;
}