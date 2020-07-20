function minesweeper(matrix) {
    let w = matrix[0].length, h = matrix.length;
    let board = [];
    
    for(let i = 0; i < h; i++) {
        let row = new Array(w);
        row.fill(0);
        board.push(row);
    }
    
    for(let i = 0; i < h; i++) {
        for(let j = 0; j < w; j++) {
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