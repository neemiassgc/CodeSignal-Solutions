def areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight)
	yl, yr, fl, fr = yourLeft, yourRight, friendsLeft, friendsRight
	return ((yl == fl and yr == fr) or (yr == fl and yl == fr))
end