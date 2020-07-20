def firstDigit(inputString)
    return inputString.chars.filter{|e| /\d/.match? e}[0]
end