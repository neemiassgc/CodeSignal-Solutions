def differentSquares(matrix)
    str, sums = "", []
    (1...matrix.size).each do |i|
        (1...matrix[0].size).each do |j|
            str += matrix[i][j].to_s+matrix[i][j - 1].to_s+
	            matrix[i - 1][j - 1].to_s+matrix[i - 1][j].to_s
            sums.push str unless sums.include? str
            str = ""
        end
    end
    return sums.size
end