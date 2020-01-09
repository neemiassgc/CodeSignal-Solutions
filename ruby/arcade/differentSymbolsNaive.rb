def differentSymbolsNaive(s)
    str = ""
    s.each_char { |c| str += c.to_s unless str.include? c.to_s }
    return str.size
end