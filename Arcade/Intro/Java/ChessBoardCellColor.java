public final class ChessBoardCellColor {

	boolean chessBoardCellColor(String cell1, String cell2) {
	    int[] xy = new int[4];
	    boolean[][] board = new boolean[8][8];
	    for(int y = 0, n = 2; y < 8; y++, n++) {
	        for(int x = 0, m = n; x < 8; x++, m++) {
	            board[y][x] = (m % 2 == 0);
	        }
	    }
	    xy[0] = cell1.charAt(0) - 'A';
	    xy[1] = Integer.valueOf(cell1.charAt(1)+"").intValue();
	    xy[2] = cell2.charAt(0) - 'A';
	    xy[3] = Integer.valueOf(cell2.charAt(1)+"").intValue();
	    return (board[xy[0]][xy[1] -= 1] == board[xy[2]][xy[3] -= 1]);
	}
}