def digitDegree(n)
    s, g, t = n.to_s, 0, 0
    while s.size > 1 do
        s.each_char { |i| t += i.to_i }
        s, t, g = t.to_s, 0, g + 1
    end
    return g
end