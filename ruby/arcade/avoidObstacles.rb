def avoidObstacles(inputArray)
	b = true
	c = 2;
	loop do
		inputArray.each do |i|
			if i % c == 0 then
				b = !b
				break
			end
		end
		return c if b
		b = true
		c += 1
	end
end