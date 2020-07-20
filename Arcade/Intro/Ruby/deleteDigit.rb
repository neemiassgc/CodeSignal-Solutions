def deleteDigit(n)
    max, s = 0, n.to_s
    s.size.times do |i|
        v = (0..s.size).to_a.filter{|j| j != i}.map{|j| s[j]}.join.to_i
        max = v if v > max
    end
    return max
end
