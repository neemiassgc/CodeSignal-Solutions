def allLongestStrings(a)
	return a.filter{|e| e.size == a.map{|e| e.size}.max}
end