final class Minesweeper {

	int[][] minesweeper(boolean[][] matrix) {
	    int w = matrix[0].length, h = matrix.length;
	    int[][] board = new int[h][w];
	    
	    for(int i = 0; i < h; i++) {
	        for(int j = 0; j < w; j++) {
	            if(matrix[i][j]) {
	                if(i + 1 < h) board[i + 1][j]++;
	                if(i + 1 < h && j - 1 >= 0) board[i + 1][j - 1]++;
	                if(j - 1 >= 0) board[i][j - 1]++;
	                if(i - 1 >= 0 && j + 1 < w) board[i - 1][j + 1]++;
	                if(i - 1 >= 0) board[i - 1][j]++;
	                if(i - 1 >= 0 && j - 1 >= 0) board[i - 1][j - 1]++;
	                if(j + 1 < w) board[i][j + 1]++;
	                if(i + 1 < h && j + 1 < w) board[i + 1][j + 1]++;
	            }
	        }
	    }
	    
	    return board;
	}
}