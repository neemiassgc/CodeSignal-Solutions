def bishopAndPawn(bishop, pawn)
	x1, y1 = bishop[0].ord - 97, bishop[1].to_i - 1
    x2, y2 = pawn[0].ord - 97, pawn[1].to_i - 1
    4.times do |i|
    	 x, y = x1, y1
    	 10.times do |j|
	    	return true if x == x2 and y == y2
	    	case i
	    		when 0
	    			x, y = x + 1, y + 1
	    		when 1
	    			x, y = x + 1, y - 1
	    		when 2
	    			x, y = x - 1, y - 1
	    		when 3
	    			x, y = x - 1, y + 1
	    	end
	    end
    end
    return false
end