def sudoku(grid)
    arr, x, r = [], 1, 0
    9.times do |t|
        arr = []
        9.times { |v| arr.push grid[t][v] }
        r += 1 unless arr.uniq.to_s.eql? arr.to_s
        arr = []
        9.times { |v| arr.push grid[v][t] }
        r += 1 unless arr.uniq.to_s.eql? arr.to_s
    end
    3.times do
        y = 1
        3.times do
            arr = []
            arr.push grid[x][y]
            arr.push grid[x][y + 1]
            arr.push grid[x - 1][y + 1]
            arr.push grid[x + 1][y + 1]
            arr.push grid[x][y - 1]
            arr.push grid[x - 1][y - 1]
            arr.push grid[x + 1][y - 1]
            arr.push grid[x + 1][y]
            arr.push grid[x- 1][y]
            r += 1 unless arr.uniq.to_s.eql? arr.to_s
            y += 3
        end
        x += 3
    end
    return r == 0
end