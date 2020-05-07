def rowsRearranging(m)
    m.permutation(m.size).to_a.each do |a|
        return true if every = -> r do
            (r.size - 1).times do |y|
                r[0].each_index do |x|
                    return false if r[y + 1][x] <= r[y][x]
                end
            end
            return true
        end.call(a)
    end
    return false
end