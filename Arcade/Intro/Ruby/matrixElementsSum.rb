def matrixElementsSum(matrix)
	sum = 0
	(0...matrix[0].size).each do |i|
		(0...matrix.size).each do |j|
			break if matrix[j][i] == 0
			sum += matrix[j][i]
		end
	end
	return sum
end