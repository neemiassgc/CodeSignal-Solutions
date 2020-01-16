def chessKnight(cell)
    moves, x, y, c = [], cell[0].ord - 97, cell[1].to_i - 1, 0
    moves[0] = (x + 2).to_s+(y + 1).to_s;
    moves[1] = (x + 2).to_s+(y - 1).to_s;
    moves[2] = (x - 2).to_s+(y + 1).to_s; 
    moves[3] = (x - 2).to_s+(y - 1).to_s;
    moves[4] = (y + 2).to_s+(x + 1).to_s;
    moves[5] = (y + 2).to_s+(x - 1).to_s;
    moves[6] = (y - 2).to_s+(x + 1).to_s;
    moves[7] = (y - 2).to_s+(x - 1).to_s;
    moves.each do |s|
	    n1, n2 = s[0].ord, s[1].ord;
	    c += 1 if(n1 >= 48 and n1 <= 55 and n2 >= 48 and n2 <= 55)
    end
	return c;
end