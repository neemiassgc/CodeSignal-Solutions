final class ChessKnight {

	boolean isSafe(int x, int y) {
	    return x >= 0 && x < 8 && y >= 0 && y < 8;
	}

	int chessKnight(String cell) {
	    int x = cell.charAt(0) - 'a',
	        y = new Integer(cell.charAt(1)+"") - 1,
	        out = 0;
	    
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
}