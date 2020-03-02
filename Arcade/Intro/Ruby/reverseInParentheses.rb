def reverseInParentheses(inputString)
	reg = /\(\w*\)/
	return inputString unless reg.match? inputString
	ss = reg.match(inputString).to_s
	s = ss.delete_prefix("(").delete_suffix(")").reverse
	return reverseInParentheses inputString.gsub(ss, s)
end