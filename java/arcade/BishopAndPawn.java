public final class BishopAndPawn {

	boolean bishopAndPawn(String bishop, String pawn) {
		int x1 = bishop.charAt(0) - 'a',
	        y1 = Integer.valueOf(bishop.charAt(1)+"").intValue() - 1,
	        x2 = pawn.charAt(0) - 'a',
	        y2 = Integer.valueOf(pawn.charAt(1)+"").intValue() - 1;
	    for(int i = 0, x = x1, y = y1; i < 4; i++, x = x1, y = y1) {
	        for(int j = 0; j < 10; j++) {
	            if(x == x2 && y == y2) { return true; }
	            switch(i) {
	                case 0:
	                    x++;
	                    y++;
	                    break;
	                case 1:
	                    x++;
	                    y--;
	                    break;
	                case 2:
	                    x--;
	                    y--;
	                    break;
	                case 3:
	                    x--;
	                    y++;
	            }
	        }
	    }
	    return false;
	}
}