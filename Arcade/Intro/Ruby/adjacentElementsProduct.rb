def adjacentElementsProduct(inputArray)
	max = inputArray[0] * inputArray[1]
	(inputArray.size - 1).times do |i|
		q = inputArray[i] * inputArray[i + 1]
		max = q if q > max
	end
	return max
end