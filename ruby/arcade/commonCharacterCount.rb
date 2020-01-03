def commonCharacterCount(s1, s2)
	ss1, ss2, chs, cnt = [], [], "", 0
	s1.each_char { |c| ss1.push c }
	s2.each_char { |c| ss2.push c }
	ss1, ss2 = ss1.uniq.join, ss2.uniq.join
	ss1.each_char { |c| chs += c if ss2.include? c }
	chs.each_char do |s|
		c1, c2 = 0, 0
		s1.each_char { |c| c1 += 1 if c == s}
		s2.each_char { |c| c2 += 1 if c == s}
		cnt += c1 < c2 ? c1 : c2
	end
	return cnt
end