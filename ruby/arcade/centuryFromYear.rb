def centuryFromYear(year)
	return year / 100 + 1 if(year / 100 * 100 < year)
	return year / 100
end