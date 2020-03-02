def allLongestStrings(inputArray)
	c = 0
	inputArray.each do |i|
		c = i.size > c ? i.size : c
	end
	s = []
	inputArray.each do |i|
		s.push i if i.size == c
	end
	return s
end