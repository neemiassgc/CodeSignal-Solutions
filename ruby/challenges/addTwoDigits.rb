def addTwoDigits(n)
    m = 0
    n.to_s.each_char { |c| m += c.to_i }
    return m
end
