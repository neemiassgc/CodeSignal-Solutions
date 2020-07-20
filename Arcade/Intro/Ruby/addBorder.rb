def addBorder(picture)
	border = "*" * (picture[0].size + 2)
	return picture.map{|e| "*"+e+"*"}.insert(0, border).push border
end