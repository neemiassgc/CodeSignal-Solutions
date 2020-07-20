def sudoku(grid)
    row, col, box = Array.new(9, 0), Array.new(9, 0), Array.new(9, 0)
    n = grid.size
    sqrt = Math.sqrt(n).to_i
    
    n.times do |i|
        n.times do |j|
            row[grid[i][j] - 1] += 1
            col[grid[j][i] - 1] += 1
        end
        
        sq = i - i % sqrt
        (sq...(sq + sqrt)).each do |y|
            (sq...(sq + sqrt)).each{|x| box[grid[y][x] - 1] += 1}
        end
        
        n.times do |j|
            return false if col[j] == 0 or row[j] == 0 or  box[j] == 0
        end
        
        box = box.fill 0
        row = row.fill 0
        col = col.fill 0
    end
    
    return true
end