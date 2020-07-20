def buildPalindrome(st)
	return st if st.reverse.eql? st
	out = sg = ""
	st.each_char{|ch|
	return out if (out = st+(sg += ch.to_s).reverse).reverse.eql? out}
end