import java.util.Arrays;

final class Sudoku {

	boolean sudoku(int[][] grid) {
	    int n = grid.length, sqrt = (int) Math.sqrt(n);
	    int[] row = new int[n], col = new int[n], box = new int[n];

	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n; j++) {
	            row[grid[i][j] - 1]++;
	            col[grid[j][i] - 1]++;   
	        }
	        
	        int sq = i - i % sqrt;
	        for(int y = sq; y < sq + sqrt; y++) {
	            for(int x = sq; x < sq + sqrt; x++) box[grid[y][x] - 1]++;
	        }
	        
	        for(int j = 0; j < n; j++)
	            if(row[j] == 0 || col[j] == 0 || box[j] == 0) return false;
	        
	        Arrays.fill(box, 0);
	        Arrays.fill(row, 0);
	        Arrays.fill(col, 0);
	    }

	    return true;
	}
}