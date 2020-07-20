def isBeautifulString(inputString)
	abc = Array.new(26, 0)
	inputString.each_byte{|b| abc[b - 97] += 1}
	25.times{|i| return false if abc[i + 1] > abc[i]}
	return true
end