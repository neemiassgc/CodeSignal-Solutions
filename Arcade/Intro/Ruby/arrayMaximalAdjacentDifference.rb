def arrayMaxConsecutiveSum(inputArray, k)
    max = t = 0
    
    (0..(inputArray.size - k)).each do |i|
        t = (i...(i + k)).to_a.map{|j| inputArray[j]}.sum
        max = t if t > max
    end
    
    return max
end
