import java.util.Arrays;

final class Sudoku2 {

    boolean sudoku2(char[][] grid) {
        int[] row = new int[9],
            col = new int[9],
            box = new int[9];
        
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                // check row
                if(grid[i][j] != '.')
                    col[new Integer(grid[i][j]+"") - 1]++;
                
                // check col
                if(grid[j][i] != '.')
                    row[new Integer(grid[j][i]+"") - 1]++;
            }
            
            // check box
            if((i + 1) % 3 == 0) {
                for(int t = 8; t > 0; t -= 3) {
                    for(int p = t; p > t - 3; p--) {
                        for(int q = i; q > i - 3; q--) {
                            if(grid[p][q] != '.')
                                box[new Integer(grid[p][q]+"") - 1]++;
                        }
                    }
                    
                    for(int p : box) if(p > 1) return false;
                    
                    Arrays.fill(box, 0);  
                }
            }
            
            for(int p = 0; p < 9; p++) {
                if(row[p] > 1 || col[p] > 1) return false;
            }
            
            Arrays.fill(row, 0);
            Arrays.fill(col, 0);
        }
        
        return true;
    }
}