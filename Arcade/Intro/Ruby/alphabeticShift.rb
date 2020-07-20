def alphabeticShift(inputString)
    return inputString.chars
        .map{|c| c == 'z' ? 'a' : (c.ord + 1).chr}.join
end