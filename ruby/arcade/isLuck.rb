def isLuck(n)
	h1, h2 = 0, 0
	(0...n.to_s.size).each do |v|
		if v <= (n.to_s.size - 1) / 2 then
			h1 += n.to_s[v].to_i
			next
		end
		h2 += n.to_s[v].to_i
	end
	return h1 == h2
end