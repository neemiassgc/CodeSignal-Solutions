def longestWord(text)
	words, max, str = [], "", ""
	text.size.times do |t|
		c = text[t].ord
		if (c >= 97 and c <= 122) or (c >= 65 and c <= 90) then
			str += text[t]
		else 
			words.push str
			str = ""
		end
		words.push str if t == text.size - 1
	end 
	words.each { |w| max = w if w.size > max.size }
	return max
end