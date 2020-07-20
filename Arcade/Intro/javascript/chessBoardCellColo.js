function chessBoardCellColor(cell1, cell2) {
    let x1 = cell1.charCodeAt(0) - 65, y1 = parseInt(cell1.charAt(1));
    let x2 = cell2.charCodeAt(0) - 65, y2 = parseInt(cell2.charAt(1));
    return (x1 + x2) % 2 == (y1 + y2) % 2;
}