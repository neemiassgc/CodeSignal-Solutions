def isCryptSolution(c, s)
    r = /^0+\d+/
    s.each do |x|
        3.times do |y|
            c[y] = c[y].gsub(x[0], x[1]) if c[y].include? x[0]
        end
    end
    return false if r.match?(c[0]) or r.match?(c[1]) or r.match?(c[2])
    return (c[0].to_i + c[1].to_i == c[2].to_i)
end