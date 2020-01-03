def palindromeRearranging(inputString)
	a, c = Array.new(26, 0), 0
    (0...inputString.size).each { |i| a[inputString[i].ord - "a".ord] += 1 }
    a.each { |i| c += 1 if i % 2 == 1 }
    return inputString.size % 2 == c
end