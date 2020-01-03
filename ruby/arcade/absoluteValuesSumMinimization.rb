def absoluteValuesSumMinimization(a)
	n = [], lower = 0
	a.size.times do |i|
		n[i] = 0
		a.each do |j|
			n[i] += (j - a[i]).abs
		end
	end
	lower = n.min
	return a[n.index(lower)]
end