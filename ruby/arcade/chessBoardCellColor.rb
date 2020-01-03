def chessBoardCellColor(cell1, cell2)
    x1, x2 = cell1[0].ord, cell1[1].ord
    y1, y2 = cell2[0].ord, cell2[1].ord
    return ((x1 + x2) % 2 == (y1 + y2) % 2)
end