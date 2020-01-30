const check = str => {
    let c = 0, chars = "";
    for(let i in str) {
        let ch = str.charAt(i);
        if(!chars.includes(ch) || ch == ".") { chars += ch; }
        else { c++; }
    }
    return c == 0;
};

const sudoku2 = grid => {
    let c = 0, str = "";
    for(let i = 0; i < 9; i++, str = "") {
        for(let j = 0; j < 9; j++) { str += grid[i][j]; }
        c = !check(str) ? c + 1 : c;
        str = "";
        for(let j = 0; j < 9; j++) { str += grid[j][i]; }
        c = !check(str) ? c + 1 : c;
    }
    for(let i = 0, x = 1; i < 3; i++, x += 3) {
        str = "";
        for(let j = 0, y = 1; j < 3; j++, y += 3, str = "") {
            str += grid[x][y];
            str += grid[x][y + 1];
            str += grid[x - 1][y + 1];
            str += grid[x + 1][y + 1];
            str += grid[x][y - 1];
            str += grid[x - 1][y - 1];
            str += grid[x + 1][y - 1];
            str += grid[x + 1][y];
            str += grid[x- 1][y];
            c = !check(str) ? c + 1 : c;
        }
    }
    return c == 0;
};