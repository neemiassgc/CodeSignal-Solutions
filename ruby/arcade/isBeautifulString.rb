def isBeautifulString(inputString)
	ints, alpha = [], Array.new(26, 0)
	inputString.each_byte do |c|
		return false if not inputString.include?((c - 1).chr) and c != 97
		alpha[c - 97] += 1
	end
	alpha.each { |a| ints.push a unless a == 0 }
	(0...(ints.size - 1)).each do |i|
		return false if ints[i] < ints[i + 1]
	end
	return true
end