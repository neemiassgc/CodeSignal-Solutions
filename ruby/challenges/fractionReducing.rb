def fractionReducing(fraction)
    res = []
    
    (1...10).each do |i|
        if fraction[0] % i == 0 and fraction[1] % i == 0 then
            res[0] = fraction[0] / i
            res[1] = fraction[1] / i
        end
    end
        
    return res
end