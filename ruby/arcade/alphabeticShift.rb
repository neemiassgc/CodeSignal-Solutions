def alphabeticShift(inputString)
    str = ""
    inputString.each_char do |c|
        str += c != 'z' ? (c.ord + 1).chr : "a"
    end
    return str
end
