def commonCharacterCount(s1, s2)
	q = (0x61..0x7b).to_a.filter{|e| s1.include?(e.chr) && s2.include?(e.chr)}
		.map{|e| e.chr}.join
	o = 0
		
	q.chars.each do |e|
		m = s1.chars.filter{|s| s == e}.length
		n = s2.chars.filter{|s| s == e}.length
		o += m < n ? m : n
	end
	return o
end