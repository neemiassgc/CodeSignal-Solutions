def evenDigitsOnly(n)
    return n.to_s.chars.all?{|e| e.to_i % 2 == 0}
end