def firstDigit(inputString)
	inputString.each_byte { |c| return c.chr if c >= 48 and c <= 57 }
end