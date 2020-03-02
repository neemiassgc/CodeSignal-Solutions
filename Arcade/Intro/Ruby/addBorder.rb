def addBorder(picture)
	r, c = [], 0
	(0...(picture.size + 2)).each do |t|
		if t == 0 or t == (picture.size + 1) then
			r[t] = "*"*(picture[0].size + 2)
			next
		end
		r[t] = "*#{picture[c]}*"
		c += 1
	end
	return r
end