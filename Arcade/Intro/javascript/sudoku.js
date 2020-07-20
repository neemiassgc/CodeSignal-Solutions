function sudoku(grid) {
    let n = grid.length, sqrt = Math.sqrt(n);
    let row = new Array(9), col = new Array(9), box = new Array(9);

    for(let i = 0; i < n; i++) {
        
        for(let j = 0; j < n; j++) {
            row[grid[i][j] - 1]++;
            col[grid[j][i] - 1]++;   
        }
        
        let sq = i - i % sqrt;
        for(let y = sq; y < sq + sqrt; y++) {
            for(let x = sq; x < sq + sqrt; x++) box[grid[y][x] - 1]++;
        }
        
        for(let j = 0; j < n; j++)
            if(row[j] == 0 || col[j] == 0 || box[j] == 0) return false;
        
        box.fill(0);
        row.fill(0);
        col.fill(0);
    }

    return true;
}