def excelSheetColumnNumber(s)
	sum, l = 0, s.size - 1
	s.size.times do |i|
		a = s[i].ord - 64
		l.times { a *= 26; }
		sum, l = sum + a, l - 1
	end
	return sum
end