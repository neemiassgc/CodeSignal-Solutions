def isLucky(n)
    str = n.to_s
    return str[0...str.size / 2].chars.map{|e| e.to_i}.sum ==
    str[(str.size / 2)..str.size].chars.map{|e| e.to_i}.sum
end