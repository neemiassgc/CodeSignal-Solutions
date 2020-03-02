def buildPalindrome(st)
	return st if st.reverse.eql? st
	res = sg = ""
	st.each_char do |ch|
		sg += ch.to_s
		res = (st+sg.reverse)
		return res if res.reverse.eql? res
	end
end