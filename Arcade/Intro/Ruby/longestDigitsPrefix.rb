def longestDigitsPrefix(inputString)
    str, b = "", true
    inputString.each_byte do |c|
        if b and c >= 48 and c <= 57 then
            str += c.chr
        else   
            b = !b if b
        end
    end
    return str
end