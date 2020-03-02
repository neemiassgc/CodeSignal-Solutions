def areSimilar(a, b)
	c = n1 = n2 = nn1 = nn2 = 0
    (0...a.size).each do |i|
        unless a[i] == b[i] then
            if c == 0 then
                n1 = a[i]
                n2 = b[i]
            elsif c == 1 then
                nn1 = b[i]
                nn2 = a[i]
            end
            c += 1
        end
    end
    return (n1 == nn1 and n2 == nn2 and c <= 2)
end