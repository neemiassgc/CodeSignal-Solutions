def sortByHeight(a)
	values, trees = [], []
	a.each_index { |t| trees.push t if a[t] == -1 }
	a.sort!
	a.each { |v| values.push v unless v == -1 }
	trees.each { |i| values.insert(i, -1) }
	return values
end