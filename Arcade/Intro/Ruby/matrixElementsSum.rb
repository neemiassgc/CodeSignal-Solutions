def matrixElementsSum(matrix)
	sum = 0
	matrix[0].size.times do |i|
		matrix.size.times do |j|
			break if matrix[j][i] == 0
			sum += matrix[j][i]
		end
	end
	return sum
end