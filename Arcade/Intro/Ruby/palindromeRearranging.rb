def palindromeRearranging(inputString)
    abc = Array.new(26, 0)
    inputString.size.times{|i| abc[inputString[i].ord - "a".ord] += 1}
    return inputString.size % 2 ==
    abc.map{|e| e % 2 == 1 ? 1 : 0}.sum
end