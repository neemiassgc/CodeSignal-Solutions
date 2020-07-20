def alternatingSums(a)
	def alternatingSums(a)
	    o = [0, 0]
		a.size.times{|i| o[(i + 1) % 2 == 0 ? 1 : 0] += a[i]}
		return o
	end
end