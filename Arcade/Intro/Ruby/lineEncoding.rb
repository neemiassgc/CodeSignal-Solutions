def lineEncoding(s)
    subs, aux, prev = [], "", s[0]
    
    s.size.times do |i|
        if s[i] != prev
            subs.push aux
            aux = prev = s[i]
            next
        end
        aux += prev = s[i]
    end
    subs.push aux
    
    return subs.map{|v| v.size > 1 ? v.size.to_s+v[0] : v[0]}.join
end