def arrayChange(inputArray)
	c = 0
	(inputArray.size - 1).times do |i|
		while inputArray[i + 1] <= inputArray[i] do
			inputArray[i +1] += 1
			c += 1
		end
	end
	return c
end