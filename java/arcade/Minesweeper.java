import java.util.Arrays;

public final class Minesweeper {

	int[][] minesweeper(boolean[][] matrix) {
		int h = matrix.length, w = matrix[0].length;
		int[] checks = new int[8];
		int[][] board = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0, k = 0; j < w; j++) {
				try {
					for(int f = 0; f < 8; f++) {
						if(checks[f] == 0) {
							k = f;
							checks[f] = 1;
							if(f == 0 && matrix[i - 1][j - 1]) { board[i][j]++; }
							if(f == 1 && matrix[i - 1][j]) {board[i][j]++; }
							if(f == 2 && matrix[i - 1][j + 1]) { board[i][j]++; }
							if(f == 3 && matrix[i][j - 1]) { board[i][j]++; }
							if(f == 4 && matrix[i][j + 1]) { board[i][j]++; }
							if(f == 5 && matrix[i + 1][j - 1]) { board[i][j]++; }
							if(f == 6 && matrix[i + 1][j]) { board[i][j]++; }
							if(f == 7 && matrix[i + 1][j + 1]) { board[i][j]++; }
						}
					}
				}
				catch(ArrayIndexOutOfBoundsException e) {
					checks[k] = 1;
					j--;
					continue;
				}
				Arrays.fill(checks, 0);
			}
		}
		return board;
	}
}