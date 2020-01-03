def evenDigitsOnly(n)
	n.to_s.each_char do |c|
		return false unless c.to_i % 2 == 0
	end
	return true
end