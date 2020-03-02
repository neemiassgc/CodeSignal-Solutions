def adjacentElementsProduct(inputArray)
	arr = []
	count = inputArray.size - 1
	(0...count).each do |i|
		arr.push(inputArray[i] * inputArray[i + 1])
	end
	max = arr[0]
	(0...count).each do |i|
		max = arr[i] if arr[i] > max
	end
	return max
end