import java.util.Arrays;

final class Sudoku2 {
    
    boolean sudoku2(char[][] grid) {
        int[] row = new int[9], col = new int[9], box = new int[9];

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(grid[i][j] != '.') row[Integer.parseInt(grid[i][j]+"") - 1]++;
                if(grid[j][i] != '.') col[Integer.parseInt(grid[j][i]+"") - 1]++;   
            }
            
            for(int j = 0; j < 9; j++) if(row[j] > 1 || col[j] > 1) return false;

            Arrays.fill(row, 0);
            Arrays.fill(col, 0);
        }
        
        for(int i = 1; i <= 9; i += 3) {
            for(int j = 1; j <= 9; j += 3) {
                if(grid[i][j] != '.')
                    box[Integer.parseInt(grid[i][j]+"") - 1]++;
                    
                if(grid[i][j + 1] != '.')
                    box[Integer.parseInt(grid[i][j + 1]+"") - 1]++;
                    
                if(grid[i - 1][j + 1] != '.')
                    box[Integer.parseInt(grid[i - 1][j + 1]+"") - 1]++;
                    
                if(grid[i + 1][j + 1] != '.')
                    box[Integer.parseInt(grid[i + 1][j + 1]+"") - 1]++;
                    
                if(grid[i][j - 1] != '.')
                    box[Integer.parseInt(grid[i][j - 1]+"") - 1]++;
                    
                if(grid[i - 1][j - 1] != '.')
                    box[Integer.parseInt(grid[i - 1][j - 1]+"") - 1]++;
                    
                if(grid[i + 1][j - 1] != '.')
                    box[Integer.parseInt(grid[i + 1][j - 1]+"") - 1]++;
                    
                if(grid[i + 1][j] != '.')
                    box[Integer.parseInt(grid[i + 1][j]+"") - 1]++;
                    
                if(grid[i - 1][j] != '.')
                    box[Integer.parseInt(grid[i - 1][j]+"") - 1]++;
                
                for(int e : box) if(e > 1) return false;
                
                Arrays.fill(box, 0);
            }
        }

        return true;
    }
}