def lineEncoding(s)
	str, res, list = "", "", []
	s.size.times do |i|
		if i == 0 then str += s[i]
		elsif s[i] == s[i - 1] then str += s[i]
		else
			list.push str
			str = s[i]
		end
		list.push str if i + 1 == s.size
	end
	list.size.times do |i|
		len = list[i].size
		if len > 1 then res += len.to_s+list[i][0]
		else res += list[i][0] 
		end
	end
	return res
end