function fancyRide(l, fares) {
    let options = ["UberX", "UberXL", "UberPlus", "UberBlack", "UberSUV"];
    fares.sort((a, b) => a - b);
    let i = 0;
    for(; i < fares.length; i++) if(fares[i] * l > 20) break;
    return options[i > 0 ? i - 1 : 0];
}