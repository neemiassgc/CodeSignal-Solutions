def giftSafety(g)
    c, p = 0, []
    (g.size - 2).times do |i|
        s = ""
        (i...(i + 3)).each { |j| s += g[j] }
        p.push s
    end
    p.each { |s| c += 1 unless s.chars.uniq.join.eql? s }
    return c
end