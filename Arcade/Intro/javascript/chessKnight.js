function isSafe(x, y) {
    return x >= 0 && x < 8 && y >= 0 && y < 8;
}

function chessKnight(cell) {
    let x = cell.charCodeAt(0) - 97,
        y = parseInt(cell[1]) - 1, out = 0;
    
    if(isSafe(x + 2, y + 1)) out++;
    if(isSafe(x + 2, y - 1)) out++;
    if(isSafe(x - 2, y + 1)) out++;
    if(isSafe(x - 2, y - 1)) out++;
    if(isSafe(x + 1, y + 2)) out++;
    if(isSafe(x - 1, y + 2)) out++;
    if(isSafe(x + 1, y - 2)) out++;
    if(isSafe(x - 1, y - 2)) out++;
    
    return out;
}