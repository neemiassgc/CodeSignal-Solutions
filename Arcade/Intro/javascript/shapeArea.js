function shapeArea(n) {
    let area = 1;
    for(let i = n; i > 1; i--) area += (i - 1) * 4;
    return area;
}