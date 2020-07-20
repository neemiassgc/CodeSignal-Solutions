def reverseInParentheses(inputString)
    reg = /\(\w*\)/
	return inputString unless reg.match? inputString
	s = reg.match(inputString).to_s
	return reverseInParentheses inputString.gsub(s, s[1..(s.size - 2)].reverse)
end