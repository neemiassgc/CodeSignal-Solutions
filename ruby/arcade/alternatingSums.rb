def alternatingSums(a)
	r, b = [0, 0], true
	a.each do |i|
		r[b ? 0 : 1] += i
		b = !b
	end
	return r
end