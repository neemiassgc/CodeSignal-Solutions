public final class Sudoku {

	boolean check(String str) {
	    String chars = "";
	    int r = 0;
	    for(char c : str.toCharArray()) {
	        if(!chars.contains(c+"")) { chars += c+""; }
	        else { r++; }
	    }
	    return r == 0;
	}

	boolean sudoku(int[][] grid) {
	    String str = "";
	    int r = 0;
	    for(int i = 0; i < 9; i++, str = "") {
	        for(int j = 0; j < 9; j++) { str += grid[i][j]+""; }
	        if(!check(str)) { r++; }
	        str = "";
	        for(int j = 0; j < 9; j++) { str += grid[j][i]+""; }
	        if(!check(str)) { r++; }
	    }
	    for(int i = 0, x = 1; i < 3; i++, x += 3) {
	        str = "";
	        for(int j = 0, y = 1; j < 3; j++, y += 3, str = "") {
	            str += grid[x][y];
	            str += grid[x][y + 1];
	            str += grid[x - 1][y + 1];
	            str += grid[x + 1][y + 1];
	            str += grid[x][y - 1];
	            str += grid[x - 1][y - 1];
	            str += grid[x + 1][y - 1];
	            str += grid[x + 1][y];
	            str += grid[x- 1][y];
	            if(!check(str)) { r++; }
	        }
	    }
	    return r == 0;
	}
}