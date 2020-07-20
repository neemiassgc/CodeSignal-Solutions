def digitDegree(n)
    counter = 0
    
    while n.to_s.size > 1
        n = n.to_s.chars.map{|e| e.to_i}.sum
        counter += 1
    end
    
    return counter
end