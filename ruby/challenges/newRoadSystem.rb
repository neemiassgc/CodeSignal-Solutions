def newRoadSystem(roadRegister)
    l, r, sum1, sum2, = "", "", 0, 0
    roadRegister.size.times do |i|
        roadRegister[0].size.times do |j|
            l, r = l + "#{i}", r + "#{j}" if roadRegister[i][j]
        end
    end
    l.each_byte { |b| sum1 += b }
    r.each_byte { |b| sum2 += b }
    return sum1 == sum2
end