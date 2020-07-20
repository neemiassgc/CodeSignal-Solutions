def differentSquares(matrix)
    set = []
    (matrix.size - 1).times do |x|
        (matrix[0].size - 1).times do |y|
            aux = ""
            (x..x+1).to_a.each{|i|
            (y..y+1).to_a.each{|j| aux += matrix[i][j].to_s}}
            set.push aux if !set.include?(aux)
        end
    end
    return set.size
end