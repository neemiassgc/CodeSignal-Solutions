def isSafe(x, y)
    return (x >= 0 and x < 8 and y >= 0 and y < 8);
end

def chessKnight(cell)
    x, y, out = cell[0].ord - 97, cell[1].to_i - 1, 0
    
    out += 1 if isSafe(x + 2, y + 1);
    out += 1 if isSafe(x + 2, y - 1);
    out += 1 if isSafe(x - 2, y + 1);
    out += 1 if isSafe(x - 2, y - 1);
    out += 1 if isSafe(x + 1, y + 2);
    out += 1 if isSafe(x - 1, y + 2);
    out += 1 if isSafe(x + 1, y - 2);
    out += 1 if isSafe(x - 1, y - 2);
    
    return out;
end