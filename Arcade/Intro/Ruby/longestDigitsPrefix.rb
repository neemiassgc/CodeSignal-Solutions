def longestDigitsPrefix(inputString)
    out = ""
    
    inputString.chars.to_a.each do |c|
        if /\d/.match? c then out += c
        else break
        end
    end
    
    return out;
end