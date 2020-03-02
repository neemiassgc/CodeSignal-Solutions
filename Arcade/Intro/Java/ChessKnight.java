public final class ChessKnight {

	int chessKnight(String cell) {
	    int x = cell.charAt(0) - 'a', c = 0,
	        y = Integer.valueOf(cell.charAt(1)+"").intValue() - 1;
	    String[] moves = new String[8];
	    moves[0] = (x + 2)+""+(y + 1);
	    moves[1] = (x + 2)+""+(y - 1);
	    moves[2] = (x - 2)+""+(y + 1); 
	    moves[3] = (x - 2)+""+(y - 1);
	    moves[4] = (y + 2)+""+(x + 1);
	    moves[5] = (y + 2)+""+(x - 1);
	    moves[6] = (y - 2)+""+(x + 1);
	    moves[7] = (y - 2)+""+(x - 1);
	    for(String s : moves) {
	        int n1 = (int)s.charAt(0), n2 = (int)s.charAt(1);
	        if(n1 >= 48 && n1 <= 55 && n2 >= 48 && n2 <= 55) { c++; }
	    }
	    return c;
	}
}