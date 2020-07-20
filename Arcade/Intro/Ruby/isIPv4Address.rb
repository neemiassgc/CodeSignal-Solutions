def isIPv4Address(inputString)
    split = inputString.split /\./
    return false if split.size != 4
    split.each do |e|
        return false if /\d*[a-z]+\d*/.match?(e) or e.size == 0
        return false if e.size > 1 and (e[0] == '0' || e.to_i > 255)
    end
    return true
end