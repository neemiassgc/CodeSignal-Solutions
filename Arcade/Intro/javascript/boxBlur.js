function boxBlur(image) {
    let h = image.length - 2, w = image[0].length - 2;
    let sumH = [];
    for(let i = 1; i <= h; i++) {
        let sumW = [];
        for(let j = 1; j <= w; j++) {
            let c =
                image[i - 1][j - 1] + image[i - 1][j] + image[i - 1][j + 1]+
                image[i][j - 1] + image[i][j] + image[i][j + 1]+
                image[i + 1][j - 1] + image[i + 1][j] + image[i + 1][j + 1];
            sumW.push(Math.floor(c / 9));
        }
        sumH.push(sumW);
    }
    
    return sumH;
}